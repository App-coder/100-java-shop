package com.shop.action.admin;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.easyui.ListBean;
import com.shop.service.admin.WithdrawService;

@Controller
@RequestMapping(value = "admin/withdraw")
public class WithdrawController extends BaseController {
	
	WithdrawService withdrawService;
	@Resource(name="withdrawService")
	public void setWithdrawService(WithdrawService withdrawService) {
		this.withdrawService = withdrawService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/withdraw";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list(int page,int rows){
		int total = this.withdrawService.getTotal();
		List list = this.withdrawService.loadWithdraw(page,rows);
		ListBean bean = new ListBean();
		bean.setTotal(total);
		bean.setRows(list);
		return objToJson(bean);
	}
	
}
