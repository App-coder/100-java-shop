package com.shop.action.admin;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.easyui.ListBean;
import com.shop.model.ShopModel;
import com.shop.model.ShopMsgTemplate;
import com.shop.service.admin.MsgTemplateService;

@Controller
@RequestMapping(value = "admin/msgtemplate")
public class MsgtemplateController extends BaseController {
	
	MsgTemplateService msgTemplateService;
	@Resource(name="msgTemplateService")
	public void setMsgTemplateService(MsgTemplateService msgTemplateService) {
		this.msgTemplateService = msgTemplateService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/msgtemplate";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public String list(){
		List<ShopMsgTemplate> models = this.msgTemplateService.loadAll();
		ListBean list = new ListBean();
		list.setRows(models);
		list.setTotal(models.size());
		return objToJson(list);
	}
	
	
}
