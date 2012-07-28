package com.shop.action.admin;

import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JsonConfig;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.easyui.ListBean;
import com.shop.model.ShopMerchShipInfo;
import com.shop.service.admin.MerchshipinfoService;
import com.shop.util.JsonDateValueProcessor;

@Controller
@RequestMapping(value = "admin/merchshipinfo")
public class MerchshipinfoController extends BaseController {
	
	MerchshipinfoService merchshipinfoService;
	@Resource(name="merchshipinfoService")
	public void setMerchshipinfoService(MerchshipinfoService merchshipinfoService) {
		this.merchshipinfoService = merchshipinfoService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/merchshipinfo";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public String list(int page,int rows,@RequestParam("if_del") int if_del){
		int total = this.merchshipinfoService.getTotal(if_del);
		List<ShopMerchShipInfo> list = this.merchshipinfoService.loadList(page,rows,if_del);
		ListBean bean = new ListBean();
		bean.setRows(list);
		bean.setTotal(total);
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new JsonDateValueProcessor("yyyy-MM-dd"));
		return objToJson(bean,jsonConfig);
	}
	
	
}
