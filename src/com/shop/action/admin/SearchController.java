package com.shop.action.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.action.admin.BaseController;
@Controller
@RequestMapping(value = "admin/search")
public class SearchController extends BaseController {
	public String index(){
		return "";
	}
}
