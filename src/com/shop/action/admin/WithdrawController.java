package com.shop.action.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "admin/withdraw")
public class WithdrawController extends BaseController {
	public String index(){
		return "";
	}
}
