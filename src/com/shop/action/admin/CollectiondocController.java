package com.shop.action.admin;

import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JsonConfig;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.easyui.ListBean;
import com.shop.model.ShopBrandCategory;
import com.shop.model.ShopCollectionDoc;
import com.shop.service.admin.CollectiondocService;
import com.shop.util.JsonDateValueProcessor;

@Controller
@RequestMapping(value = "admin/collectiondoc")
public class CollectiondocController extends BaseController {
	
	CollectiondocService collectiondocService;
	@Resource(name="collectiondocService")
	public void setCollectiondocService(CollectiondocService collectiondocService) {
		this.collectiondocService = collectiondocService;
	}


	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/collectiondoc";
	}
	
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public String list(int page,int rows,int if_del){
		int total = this.collectiondocService.getTotal(if_del);
		List<ShopCollectionDoc> list = this.collectiondocService.loadList(page,rows,if_del);
		ListBean bean = new ListBean();
		bean.setRows(list);
		bean.setTotal(total);
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new JsonDateValueProcessor("yyyy-MM-dd HH:mm:ss"));
		return objToJson(bean,jsonConfig);
	}
	
	
}
