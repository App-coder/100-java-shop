package com.shop.action.admin;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.easyui.ListBean;
import com.shop.model.ShopLogOperation;
import com.shop.service.admin.LogoperationService;

@Controller
@RequestMapping(value = "admin/logoperation")
public class LogoperationController extends BaseController {

	LogoperationService logoperationService;
	@Resource(name="logoperationService")
	public void setLogoperationService(LogoperationService logoperationService) {
		this.logoperationService = logoperationService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/logoperation";
	}
	
	/**
	 * @param page
	 * @param rows
	 * @param starttime
	 * @param endtime
	 * @return 
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list(int page,int rows,String starttime,String endtime){
		int total = this.logoperationService.getTotal(starttime,endtime);
		List<ShopLogOperation> logOperations = this.logoperationService.loadOperations(page,rows,starttime,endtime);
		
		ListBean bean = new ListBean(); 
		bean.setRows(logOperations);
		bean.setTotal(total);
		return objToJson(bean);
	}
	
}
