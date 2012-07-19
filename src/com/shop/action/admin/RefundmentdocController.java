package com.shop.action.admin;

import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JsonConfig;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.easyui.ListBean;
import com.shop.model.ShopCollectionDoc;
import com.shop.model.ShopRefundmentDoc;
import com.shop.service.admin.CollectiondocService;
import com.shop.service.admin.RefundmentdocService;
import com.shop.util.JsonDateValueProcessor;

@Controller
@RequestMapping(value = "admin/refundmentdoc")
public class RefundmentdocController extends BaseController {
	
	RefundmentdocService refundmentdocService;
	@Resource(name="refundmentdocService")
	public void setRefundmentdocService(RefundmentdocService refundmentdocService) {
		this.refundmentdocService = refundmentdocService;
	}


	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/refundmentdoc";
	}
	
	



	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public String list(int page,int rows,int if_del){
		int total = this.refundmentdocService.getTotal(if_del);
		List<ShopRefundmentDoc> list = this.refundmentdocService.loadList(page,rows,if_del);
		ListBean bean = new ListBean();
		bean.setRows(list);
		bean.setTotal(total);
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new JsonDateValueProcessor("yyyy-MM-dd"));
		return objToJson(bean,jsonConfig);
	}
	
}
