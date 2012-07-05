package com.shop.action.admin;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.easyui.ListBean;
import com.shop.model.ShopUserGroup;
import com.shop.service.admin.UserGroupService;

@Controller
@RequestMapping(value = "admin/usergroup")
public class UserGroupController extends BaseController {
	
	UserGroupService userGroupService;
	@Resource(name="userGroupService")
	public void setUserGroupService(UserGroupService userGroupService) {
		this.userGroupService = userGroupService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/usergroup";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list(@RequestParam("page") int page,@RequestParam("rows") int rows){
		int total = this.userGroupService.getTotal();
		List<ShopUserGroup> models = this.userGroupService.loadModel(page,rows);
		ListBean list = new ListBean();
		list.setRows(models);
		list.setTotal(total);
		return objToJson(list);
	}
	
	
}
