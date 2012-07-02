package com.shop.action.admin;

import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JsonConfig;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.easyui.ListBean;
import com.shop.model.ShopSpecPhoto;
import com.shop.service.admin.SpecphotoService;
import com.shop.util.JsonDateValueProcessor;

@Controller
@RequestMapping(value = "admin/specphoto")
public class SpecphotoController extends BaseController {
	
	SpecphotoService specphotoService;
	@Resource(name="specphotoService")
	public void setSpecphotoService(SpecphotoService specphotoService) {
		this.specphotoService = specphotoService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/specphoto";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list(int page,int rows){
		int total = this.specphotoService.getTotal();
		List<ShopSpecPhoto> models = this.specphotoService.loadModel(page,rows);
		ListBean list = new ListBean();
		list.setRows(models);
		list.setTotal(total);
		
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new JsonDateValueProcessor("yyyy-MM-dd HH:mm:ss"));
		
		return objToJson(list,jsonConfig);
	}
	
	
}
