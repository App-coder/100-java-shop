package com.shop.action.admin;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.easyui.ListBean;
import com.shop.model.ShopSpec;
import com.shop.service.admin.SpecService;

@Controller
@RequestMapping(value = "admin/spec")
public class SpecController extends BaseController {
	
	SpecService specService;
	@Resource(name="specService")
	public void setSpecService(SpecService specService) {
		this.specService = specService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/spec";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list(int page,int rows,int isdel){
		int total = this.specService.getTotal(isdel);
		List<ShopSpec> models = this.specService.loadModel(page,rows,isdel);
		ListBean list = new ListBean();
		list.setRows(models);
		list.setTotal(total);
		return objToJson(list);
	}
	
}
