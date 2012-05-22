package com.shop.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "admin/ticketexcel")
public class TicketexcelController extends BaseController {
	public String index(){
		return "";
	}
}
