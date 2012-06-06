package com.shop.action.admin;

import javax.annotation.Resource;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shop.bean.easyui.ListBean;
import com.shop.model.ShopBrand;
import com.shop.service.admin.BrandService;
import java.util.*;

@Controller
@RequestMapping(value = "admin/brand")
public class BrandController extends BaseController {
	
	BrandService brandService;
	@Resource(name="brandService")
	public void setBrandService(BrandService brandService) {
		this.brandService = brandService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/brand";
	}
	
	/**
	 * 
	 * 品牌列表
	 * 
	 * @param page 页码
	 * @param rows 每页显示行数
	 * @return
	 */
	public String list(int page,int rows){
		int total = this.brandService.getTotal();
		List<ShopBrand> brands = this.brandService.loadBrand(page,rows);
		ListBean bean = new ListBean();
		bean.setTotal(total);
		bean.setRows(brands);
		return objToJson(bean);
	}
	
	
	
	
}
