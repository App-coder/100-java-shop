package com.shop.action.admin;

import net.sf.json.JSONArray;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.model.ShopDelivery;
import com.shop.service.admin.DeliveryService;

import java.util.*;

import javax.annotation.Resource;


@Controller
@RequestMapping(value = "admin/delivery")
public class DeliveryController {
	
	private DeliveryService deliveryService;
	@Resource(name="deliveryService")
	public void setDeliveryService(DeliveryService deliveryService) {
		this.deliveryService = deliveryService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		
		return "admin/delivery";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list(){
		List<ShopDelivery> deliverys  = this.deliveryService.loadAll();
		return JSONArray.fromObject(deliverys).toString();
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public String add(){
		return "";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public String update(){
		return "";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public String delete(){
		return "";
	}
	
}
