package com.shop.action.admin;

import javax.annotation.Resource;
import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.easyui.ListBean;
import com.shop.model.ShopPromotion;
import com.shop.service.admin.PromotionService;

@Controller
@RequestMapping(value = "admin/promotion")
public class PromotionController extends BaseController {

	PromotionService promotionService;
	@Resource(name="promotionService")
	public void setPromotionService(PromotionService promotionService) {
		this.promotionService = promotionService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/promotion";
	}
	
	/**
	 * @param page
	 * @param rows
	 * @param type 0:购物车促销规则 1:商品限时抢购
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list(int page,int rows,int type){
		int total = this.promotionService.getTotalByType(type);
		List<ShopPromotion> promotions = this.promotionService.loadByType(type);
		
		ListBean list = new ListBean();
		list.setTotal(total);
		list.setRows(promotions);
		
		return objToJson(list);
	}
	
	
}
