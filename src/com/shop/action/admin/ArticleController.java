package com.shop.action.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.service.admin.ArticleService;

@Controller
@RequestMapping(value = "admin/article")
public class ArticleController extends BaseController {
	
	ArticleService articleService;
	
	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/article";
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	@ResponseBody
	public String list(){
		
		return "";
	}
	
	
}
