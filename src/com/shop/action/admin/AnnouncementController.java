package com.shop.action.admin;

import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.easyui.ListBean;
import com.shop.model.ShopAnnouncement;
import com.shop.service.admin.AnnouncementService;
import com.shop.util.JsonDateValueProcessor;

@Controller
@RequestMapping(value = "admin/announcement")
public class AnnouncementController extends BaseController {
	
	AnnouncementService announcementService;
	@Resource(name="announcementService")
	public void setAnnouncementService(AnnouncementService announcementService) {
		this.announcementService = announcementService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/announcement";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list(){
		List<ShopAnnouncement> list = this.announcementService.loadAll();
		ListBean bean = new ListBean();
		bean.setRows(list);
		bean.setTotal(list.size());
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new JsonDateValueProcessor("yyyy-MM-dd HH:mm:ss"));
		return objToJson(bean,jsonConfig);
	}
	
}
