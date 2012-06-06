package com.shop.action.admin;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.common.Message;
import com.shop.bean.easyui.ListBean;
import com.shop.model.ShopBrandCategory;
import com.shop.service.admin.BrandCategoryService;

@Controller
@RequestMapping(value = "admin/brandcategory")
public class BrandcategoryController extends BaseController {
	
	BrandCategoryService brandCategoryService;
	@Resource(name="brandCategoryService")
	public void setBrandCategoryService(BrandCategoryService brandCategoryService) {
		this.brandCategoryService = brandCategoryService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/brandcategory";
	}
	
	/**
	 * 返回Grid的列表
	 * 
	 * @return
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	@ResponseBody
	public String list(){
		List<ShopBrandCategory> list = this.brandCategoryService.loadAll();
		ListBean bean = new ListBean();
		bean.setRows(list);
		bean.setTotal(list.size());
		return objToJson(bean);
	}
	
	
	/**
	 * 品牌分类编辑，包含添加和修改操作
	 * 
	 * @param brandCategory 品牌分类
	 * @return
	 */
	public String edit(ShopBrandCategory brandCategory){
		int affectrows  = 0;
		if(brandCategory.getId()!=null){
			affectrows = this.brandCategoryService.update(brandCategory);
		}else{
			affectrows = this.brandCategoryService.add(brandCategory);
		}
		
		Message msg = new Message();
		if(affectrows>=1){
			msg.setMessage("品牌分类编辑成功！");
			msg.setType("true");
		}else{
			msg.setMessage("品牌分类编辑时发生异常！");
			msg.setType("false");
		}
		return objToJson(msg);
	}
	
	
	/**
	 * 通过IDS进行删除
	 * 
	 * @param ids 品牌分类ID
	 * @return
	 */
	public String delete(int ids){
		int affectrows = this.brandCategoryService.deleteById(ids);
		Message msg = new Message();
		if(affectrows>=1){
			msg.setMessage("品牌分类删除成功！");
			msg.setType("true");
		}else{
			msg.setMessage("品牌分类删除时发生异常！");
			msg.setType("false");
		}
		return objToJson(msg);
		
	}
	
	
	
}
