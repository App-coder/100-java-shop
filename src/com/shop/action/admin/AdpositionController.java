package com.shop.action.admin;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.easyui.ListBean;
import com.shop.model.ShopAdPosition;
import com.shop.service.admin.AdpositionService;

@Controller
@RequestMapping(value = "admin/adposition")
public class AdpositionController extends BaseController {
	
	AdpositionService adpositionService;
	@Resource(name="adpositionService")
	public void setAdpositionService(AdpositionService adpositionService) {
		this.adpositionService = adpositionService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/adposition";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list(){
		List<ShopAdPosition> list = this.adpositionService.loadAll();
		ListBean bean = new ListBean();
		bean.setRows(list);
		bean.setTotal(list.size());
		return arrayToJson(list);
	}
			
	
	
}
