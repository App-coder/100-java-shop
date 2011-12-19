package com.shop.action.admin;

import java.util.List;

import javax.annotation.Resource;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.easyui.ListBean;
import com.shop.model.ShopEmailRegistry;
import com.shop.service.admin.EmailregistryService;

@Controller
@RequestMapping(value = "admin/emailregistry")
public class EmailregistryController extends BaseController {
	
	EmailregistryService emailregistryService;
	@Resource(name="emailregistryService")
	public void setEmailregistryService(EmailregistryService emailregistryService) {
		this.emailregistryService = emailregistryService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/emailregistry";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public String filter(int page,int rows){
		int total = this.emailregistryService.getTotal();
		List<ShopEmailRegistry> models = this.emailregistryService.loadList(page,rows);
		ListBean bean = new ListBean();
		bean.setTotal(total);
		bean.setRows(models);
		return objToJson(bean);
	}
	
	
}
