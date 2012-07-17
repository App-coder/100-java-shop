package com.shop.action.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "admin/stat")
public class StatController extends BaseController {

	public String userreg(){
		return "admin/stat/userreg";
	}
	
	public String spandingavg(){
		return "admin/stat/spandingavg";
	}
	
	public String amount(){
		return "admin/stat/amount";
	}
	
}
