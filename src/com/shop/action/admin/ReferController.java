package com.shop.action.admin;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.ListBean;
import com.shop.model.ShopRefer;
import com.shop.service.admin.ReferService;
import java.util.*;

@Controller
@RequestMapping(value = "admin/refer")
public class ReferController extends BaseController {
	
	ReferService referService;
	@Resource(name="referService")
	public void setReferService(ReferService referService) {
		this.referService = referService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/refer";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list(int page,int rows,String username,String goodsname,String starttime,String endtime){
		int total = this.referService.getTotal(username,goodsname,starttime,endtime);
		List<ShopRefer> refers = this.referService.loadRefer(page,rows,username,goodsname,starttime,endtime);
		ListBean bean = new ListBean();
		bean.setTotal(total);
		bean.setRows(refers);
		return objToJson(bean);
	}
	
	
}
