package com.shop.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "admin/category")
public class CategoryController extends BaseController {
	
	public String index(){
		return "";
	}
	
	public String add(){
		return "";
	}
	
}
