package com.shop.action.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "admin/articlecategory")
public class ArticlecategoryController extends BaseController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/articlecategory";
	}
	
	
	
}
