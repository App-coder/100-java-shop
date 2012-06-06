package com.shop.action.admin;

import javax.annotation.Resource;

import net.sf.json.JSONArray;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.common.Message;
import com.shop.model.ShopFreightCompany;
import com.shop.service.admin.FreightCompanyService;

import java.util.*;

@Controller
@RequestMapping(value = "admin/freightcompany")
public class FreightCompanyController extends BaseController {
	
	FreightCompanyService freightCompanyService;
	@Resource(name="freightCompanyService")
	public void setFreightCompanyService(FreightCompanyService freightCompanyService) {
		this.freightCompanyService = freightCompanyService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/freightcompany";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list(@RequestParam("isdel") int isdel){
		List<ShopFreightCompany> freightCompanys= this.freightCompanyService.loadByIsdel(isdel);
		return JSONArray.fromObject(freightCompanys).toString();
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	@ResponseBody
	public String update(@RequestParam("freightCompany") ShopFreightCompany freightCompany){
		int affectrow = this.freightCompanyService.update(freightCompany);
		Message message = null;
		if(affectrow == 1){
			message = new Message("true","物流公司修改成功");
		}else{
			message = new Message("false","物流公司修改异常");
		}
		return JSONArray.fromObject(message).toString();
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	@ResponseBody
	public String add(@RequestParam("freightCompany") ShopFreightCompany freightCompany){
		int affectrow = this.freightCompanyService.add(freightCompany);
		Message message = null;
		if(affectrow == 1){
			message = new Message("true","物流公司添加成功");
		}else{
			message = new Message("false","物流公司添加异常");
		}
		return JSONArray.fromObject(message).toString();
	}
	
	@RequestMapping(value = "/updateState", method = RequestMethod.GET)
	@ResponseBody
	public String updateState(int id,int is_del){
		int affectrow = this.freightCompanyService.updateState(id,is_del);
		Message message = null;
		if(affectrow == 1){
			message = new Message("true","物流公司状态设置成功");
		}else{
			message = new Message("false","物流公司状态设置异常");
		}
		return JSONArray.fromObject(message).toString();
	}
	
	@RequestMapping(value = "/deleteById", method = RequestMethod.GET)
	@ResponseBody
	public String deleteById(int id){
		int affectrow = this.freightCompanyService.deleteById(id);
		Message message = null;
		if(affectrow == 1){
			message = new Message("true","物流公司删除成功");
		}else{
			message = new Message("false","物流公司删除异常");
		}
		return JSONArray.fromObject(message).toString();
	}
}
