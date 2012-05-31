package com.shop.action.admin;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.model.ShopAdminRole;
import com.shop.service.admin.AdminRoleService;

import java.util.*;

@Controller
@RequestMapping(value = "admin/adminrole")
public class AdminroleController extends BaseController {
	
	AdminRoleService adminRoleService;
	@Resource(name="adminRoleService")
	public void setAdminRoleService(AdminRoleService adminRoleService) {
		this.adminRoleService = adminRoleService;
	}
 

	@RequestMapping(value = "/getAdminRole", method = RequestMethod.POST)
	@ResponseBody
	public String getAdminRoleIsDel(int is_del){
		List<ShopAdminRole> adminRoleList = this.adminRoleService.loadByIsDel(is_del);
		return this.objToJson(adminRoleList,null);
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/adminrole";
	}
	
}
