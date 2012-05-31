package com.shop.action.admin;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.ComboTree;
import com.shop.bean.Message;
import com.shop.model.ShopCategory;
import com.shop.service.admin.CategoryService;

import java.util.*;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "admin/category")
public class CategoryController extends BaseController {
	
	CategoryService categoryService;
	@Resource(name="categoryService")
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/category";
	}
	
	/**
	 * 
	 * 商品的添加修改
	 * 
	 * @param 商品分类的MODEL
	 * @return
	 */
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	@ResponseBody
	public String edit(ShopCategory category){
		int affectrows  = 0;
		if(category.getId()!=null){
			affectrows = this.categoryService.update(category);
		}else{
			affectrows = this.categoryService.add(category);
		}
		
		Message msg = new Message();
		if(affectrows>=1){
			msg.setMessage("商品编辑成功！");
			msg.setType("true");
		}else{
			msg.setMessage("商品编辑时发生异常！");
			msg.setType("false");
		}
		return objToJson(msg);
	}
	
	/**
	 * @return 返回商品分类的TreeGrid
	 */
	@RequestMapping(value = "/categoryComboTree", method = RequestMethod.GET)
	@ResponseBody
	public String categoryComboTree(){
		
		List<ShopCategory> catagorys = this.categoryService.loadAll();
		List<ComboTree> comboTree = new ArrayList<ComboTree>();
		
		for(int i=0;i<catagorys.size();i++){
			if(catagorys.get(i).getParentId() == 0){
				ComboTree cbotree = new ComboTree();
				cbotree.setId(catagorys.get(i).getId());
				cbotree.setText(catagorys.get(i).getName());
				cbotree.setChildren(this.getCboTree(catagorys.get(i), catagorys));
				comboTree.add(cbotree);
			}
		}
		
		return arrayToJson(comboTree);
	}
	
	public List<ComboTree> getCboTree(ShopCategory parent,List<ShopCategory> catagorys){
		
		List<ComboTree> childs = new ArrayList<ComboTree>(); 
		
		for(int i=0;i<catagorys.size();i++){
			if(catagorys.get(i).getParentId()== parent.getId()){
				ComboTree cbotree = new ComboTree();
				cbotree.setId(catagorys.get(i).getId());
				cbotree.setText(catagorys.get(i).getName());
				cbotree.setChildren(this.getCboTree(catagorys.get(i), catagorys));
				childs.add(cbotree);
			}
		}
		return childs; 
	}
	
	/**
	 * 根据id对商品分类进行删除
	 * 
	 * @param id 商品分类的ID
	 * @return
	 */
	public String delete(int id){
		int affectrows = this.categoryService.deleteById(id);
		Message msg = new Message();
		if(affectrows>=1){
			msg.setMessage("商品分类删除成功！");
			msg.setType("true");
		}else{
			msg.setMessage("商品分类删除时发生异常！");
			msg.setType("false");
		}
		return objToJson(msg);
	}
	
}
