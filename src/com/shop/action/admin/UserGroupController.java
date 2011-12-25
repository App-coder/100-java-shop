package com.shop.action.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "admin/usergroup")
public class UserGroupController extends BaseController {
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(){
		
		return "admin/usergroup";
	}
}