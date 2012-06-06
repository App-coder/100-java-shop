package com.shop.action.admin;

import javax.annotation.Resource;
import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.common.Message;
import com.shop.bean.easyui.ListBean;
import com.shop.model.ShopAccountLog;
import com.shop.service.admin.AccountlogService;

@Controller
@RequestMapping(value = "admin/accountlog")
public class AccountlogController extends BaseController {
	
	AccountlogService accountlogService;
	@Resource(name="accountlogService")
	public void setAccountlogService(AccountlogService accountlogService) {
		this.accountlogService = accountlogService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/accountlog";
	}
	
	/**
	 * @param page
	 * @param rows
	 * @param starttime
	 * @param endtime
	 * @param event  1.充值,2.提现,4.退款
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list(int page,int rows,String starttime,String endtime,String event){
		int total = this.accountlogService.getTotalByEvent(starttime,endtime,event);
		List<ShopAccountLog> accountlogs = this.accountlogService.loadByEvent(page,rows,starttime,endtime,event);
		ListBean bean = new ListBean();
		bean.setRows(accountlogs);
		bean.setTotal(total);
		return objToJson(bean);
	}
	
	/**
	 * @param month 
	 * @return
	 */
	public String deleteInMonth(int month){
		int affectrows = this.accountlogService.deleteByMonth(month);
		
		Message msg = new Message();
		if(affectrows>=1){
			msg.setMessage("资金操作记录删除成功！");
			msg.setType("true");
		}else{
			msg.setMessage("资金操作记录删除时发生异常！");
			msg.setType("false");
		}
		return objToJson(msg);
		
		
	}
	
	
}
