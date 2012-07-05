package com.shop.action.admin;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.easyui.ListBean;
import com.shop.model.ShopHelpCategory;
import com.shop.service.admin.HelpcategoryService;

@Controller
@RequestMapping(value = "admin/helpcategory")
public class HelpcategoryController extends BaseController {
	
	HelpcategoryService helpcategoryService;
	@Resource(name="helpcategoryService")
	public void setHelpcategoryService(HelpcategoryService helpcategoryService) {
		this.helpcategoryService = helpcategoryService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/helpcategory";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list(@RequestParam("page") int page,@RequestParam("rows") int rows){
		int total = this.helpcategoryService.getTotal();
		List<ShopHelpCategory> models = this.helpcategoryService.loadModel(page,rows);
		ListBean list = new ListBean();
		list.setRows(models);
		list.setTotal(total);
		return objToJson(list);
	}
	
}
