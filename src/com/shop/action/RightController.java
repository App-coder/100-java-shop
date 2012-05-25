package com.shop.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.ListBean;
import com.shop.model.ShopRight;
import com.shop.service.ShopRightService;

import java.util.*;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "admin/right")
public class RightController extends BaseController {
	
	private ShopRightService shopRightService;
	@Resource(name="shopRightService")
	public void setShopRightService(ShopRightService shopRightService) {
		this.shopRightService = shopRightService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/right";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list(){
		
		List<ShopRight> rights = this.shopRightService.loadRights();
		ListBean listbean = new ListBean(rights);
		return objToJson(listbean, null);
	}
}
