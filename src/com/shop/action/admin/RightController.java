package com.shop.action.admin;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.ComboTree;
import com.shop.bean.ListBean;
import com.shop.bean.TreeGrid;
import com.shop.model.ShopRight;
import com.shop.service.admin.RightService;

import java.util.*;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "admin/right")
public class RightController extends BaseController {
	
	private RightService rightService;
	@Resource(name="rightService")
	public void setShopRightService(RightService rightService) {
		this.rightService = rightService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/right";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list(){
		
		List<ShopRight> rights = this.rightService.loadRights();
		TreeGrid treegrid = new TreeGrid(rights);
		return objToJson(treegrid);
	}
	
	@RequestMapping(value = "/rightComboTree", method = RequestMethod.GET)
	@ResponseBody
	public String rightComboTree(){
		List<ShopRight> rights = this.rightService.loadAll();
		
		List<ComboTree> comboTree = new ArrayList<ComboTree>();
		
		//添加主权限
		for(int i=0;i<rights.size();i++){
			if(rights.get(i).getItemid() == 0){
				ComboTree cbotree = new ComboTree();
				cbotree.setId(rights.get(i).getId());
				cbotree.setText(rights.get(i).getName());
				cbotree.setChildren(this.getCboTree(rights.get(i), rights));
				comboTree.add(cbotree);
			}
		}
		
		return arrayToJson(comboTree);
	}
	
	
	public List<ComboTree> getCboTree(ShopRight parent,List<ShopRight> rights){
		
		List<ComboTree> childs = new ArrayList<ComboTree>(); 
		
		for(int i=0;i<rights.size();i++){
			if(rights.get(i).getItemid()== parent.getId()){
				ComboTree cbotree = new ComboTree();
				cbotree.setId(rights.get(i).getId());
				cbotree.setText(rights.get(i).getName());
				cbotree.setChildren(this.getCboTree(rights.get(i), rights));
				childs.add(cbotree);
			}
		}
		return childs; 
	}
	
}
