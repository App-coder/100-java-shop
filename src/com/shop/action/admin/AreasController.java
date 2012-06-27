package com.shop.action.admin;

import javax.annotation.Resource;


import net.sf.json.JSONArray;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.model.ShopAreas;
import com.shop.service.admin.AreasService;
import java.util.*;

@Controller
@RequestMapping(value = "admin/areas")
public class AreasController extends BaseController {
	
	AreasService areasService; 
	@Resource(name="areasService")
	public void setAreasService(AreasService areasService) {
		this.areasService = areasService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/areas";
	}
	
	@RequestMapping(value = "/getAreaByParent", method = RequestMethod.POST)
	@ResponseBody
	public String getAreaByParent(@RequestParam("pid") int pid){
		List<ShopAreas> areas = this.areasService.getAreaByParent(pid);
		return JSONArray.fromObject(areas).toString();
	}

}
