package com.shop.action.admin;

import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JsonConfig;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.easyui.ListBean;
import com.shop.model.ShopRefundmentDoc;
import com.shop.service.admin.DeliverydocService;
import com.shop.service.admin.ReturnsdocService;
import com.shop.util.JsonDateValueProcessor;

@Controller
@RequestMapping(value = "admin/returnsdoc")
public class ReturnsdocController extends BaseController {
	
	ReturnsdocService returnsdocService;
	@Resource(name="returnsdocService")
	public void setReturnsdocService(ReturnsdocService returnsdocService) {
		this.returnsdocService = returnsdocService;
	}


	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/returnsdoc";
	}
	

	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public String list(int page,int rows,int if_del){
		int total = this.returnsdocService.getTotal(if_del);
		List<ShopRefundmentDoc> list = this.returnsdocService.loadList(page,rows,if_del);
		ListBean bean = new ListBean();
		bean.setRows(list);
		bean.setTotal(total);
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new JsonDateValueProcessor("yyyy-MM-dd"));
		return objToJson(bean,jsonConfig);
	}
	
	
}
