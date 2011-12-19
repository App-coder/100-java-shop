package com.shop.action.admin;

import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JsonConfig;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.easyui.ListBean;
import com.shop.model.ShopMessage;
import com.shop.service.admin.MessageService;
import com.shop.util.JsonDateValueProcessor;

@Controller
@RequestMapping(value = "admin/message")
public class MessageController extends BaseController {
	
	MessageService messageService;
	@Resource(name="messageService")
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/message";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public String list(int page,int rows){
		int total = this.messageService.getTotal();
		List<ShopMessage> list = this.messageService.loadList(page,rows);
		ListBean bean = new ListBean();
		bean.setRows(list);
		bean.setTotal(list.size());
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new JsonDateValueProcessor("yyyy-MM-dd"));
		return objToJson(bean,jsonConfig);
	}
	
	
}
