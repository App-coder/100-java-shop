package com.shop.action;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.ListBean;
import com.shop.model.ShopAdmin;
import com.shop.service.AdminService;
import com.shop.util.JsonDateValueProcessor;

import java.util.*;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "admin/admin")
public class AdminController extends BaseController {
	
	AdminService adminService;
	@Resource(name="adminService")
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/admin";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public String list(){
		
		ListBean listbean = new ListBean();
		List<ShopAdmin> adminlist = this.adminService.loadByIsDel(0);
		listbean.setTotal(adminlist.size());
		listbean.setRows(adminlist);
		
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new JsonDateValueProcessor("yyyy-MM-dd HH:mm:ss"));
		
		return JSONObject.fromObject(listbean,jsonConfig).toString();
	}
	
}
