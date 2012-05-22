package com.shop.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.action.BaseController;
@Controller
@RequestMapping(value = "admin/search")
public class SearchController extends BaseController {
	public String index(){
		return "";
	}
}
