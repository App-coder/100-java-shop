package com.shop.action.admin;

import javax.annotation.Resource;
import java.util.*;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.easyui.ListBean;
import com.shop.model.ShopPayPlugin;

@Controller
@RequestMapping(value = "admin/payment")
public class PaymentController extends BaseController {
	
	
	PayPluginService payPluginService;
	@Resource(name="payPluginService")
	public void setPayPluginService(PayPluginService payPluginService) {
		this.payPluginService = payPluginService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/payment";
	}
	
	@RequestMapping(value = "/usepayment", method = RequestMethod.GET)
	@ResponseBody
	public String usepayment(){
		List<ShopPayPlugin> payPlugins = this.payPluginService.loadPayment();
		ListBean bean = new ListBean();
		bean.setRows(payPlugins);
		bean.setTotal(payPlugins.size());
		return JSONObject.fromObject(bean).toString();
	}
	
	@RequestMapping(value = "/allpayment", method = RequestMethod.GET)
	@ResponseBody
	public String allpayment(){
		List<ShopPayPlugin> payPlugins = this.payPluginService.loadPayPluginsByVisibility(1);
		ListBean bean = new ListBean();
		bean.setRows(payPlugins);
		bean.setTotal(payPlugins.size());
		return JSONObject.fromObject(bean).toString();
	}
	
	
}
