package com.shop.action.admin;

import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JsonConfig;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.easyui.ListBean;
import com.shop.model.ShopAdManage;
import com.shop.service.admin.AdManageService;
import com.shop.util.JsonDateValueProcessor;

@Controller
@RequestMapping(value = "admin/admanage")
public class AdmanageController extends BaseController {
	
	AdManageService adManageService;
	@Resource(name="adManageService")
	public void setAdManageService(AdManageService adManageService) {
		this.adManageService = adManageService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/admanage";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list(){
		List<ShopAdManage> list = this.adManageService.loadAll();
		ListBean bean = new ListBean();
		bean.setRows(list);
		bean.setTotal(list.size());
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new JsonDateValueProcessor("yyyy-MM-dd"));
		return arrayToJson(list,jsonConfig);
	}
	
}
