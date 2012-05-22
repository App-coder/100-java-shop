package com.shop.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "admin/accountlog")
public class AccountlogController extends BaseController {
	public String index(){
		return "";
	}
	
}
