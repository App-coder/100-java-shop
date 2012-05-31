package com.shop.action.admin;

import javax.annotation.Resource;
import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.ListBean;
import com.shop.bean.Message;
import com.shop.model.ShopRegiment;
import com.shop.service.admin.RegimentService;

@Controller
@RequestMapping(value = "admin/regiment")
public class RegimentController extends BaseController {
	
	RegimentService regimentService;
	@Resource(name="regimentService")
	public void setRegimentService(RegimentService regimentService) {
		this.regimentService = regimentService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/regiment";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list(int page,int rows){
		int total = this.regimentService.getTotal();
		List<ShopRegiment> regiments = this.regimentService.loadRegiment(page,rows);
		
		ListBean bean = new ListBean();
		bean.setTotal(total);
		bean.setRows(regiments);
		
		return objToJson(bean);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	@ResponseBody
	public String delete(int ids){
		int affectrows = this.regimentService.deleteByIds(ids);
		
		Message msg = new Message();
		if(affectrows>=1){
			msg.setMessage("团购删除成功！");
			msg.setType("true");
		}else{
			msg.setMessage("团购删除时发生异常！");
			msg.setType("false");
		}
		return objToJson(msg);
	}
	
}
