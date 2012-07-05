package com.shop.action.admin;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.easyui.ListBean;
import com.shop.model.ShopHelp;
import com.shop.service.admin.HelpService;

@Controller
@RequestMapping(value = "admin/help")
public class HelpController extends BaseController {

	HelpService helpService;
	@Resource(name="helpService")
	public void setHelpService(HelpService helpService) {
		this.helpService = helpService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/help";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list(@RequestParam("page") int page,@RequestParam("rows") int rows){
		int total = this.helpService.getTotal();
		List<ShopHelp> models = this.helpService.loadModel(page,rows);
		ListBean list = new ListBean();
		list.setRows(models);
		list.setTotal(total);
		return objToJson(list);
	}
	
}
