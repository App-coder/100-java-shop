package com.shop.action.admin;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.easyui.ListBean;
import com.shop.model.ShopTicket;
import com.shop.service.admin.TicketService;
import java.util.*;
@Controller
@RequestMapping(value = "admin/ticket")
public class TicketController extends BaseController {
	
	TicketService ticketService;
	@Resource(name="ticketService")
	public void setTicketService(TicketService ticketService) {
		this.ticketService = ticketService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/ticket";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list(int page,int rows){
		int total = this.ticketService.getTotal();
		List<ShopTicket> tickets = this.ticketService.loadList(page,rows);
		
		ListBean bean = new ListBean();
		bean.setRows(tickets);
		bean.setTotal(total);
		
		return objToJson(bean);
	}
	
}
