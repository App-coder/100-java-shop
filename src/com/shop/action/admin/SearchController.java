package com.shop.action.admin;

import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONArray;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.service.admin.SearchService;
@Controller
@RequestMapping(value = "admin/search")
public class SearchController extends BaseController {
	
	SearchService searchService;
	@Resource(name="searchService")
	public void setSearchService(SearchService searchService) {
		this.searchService = searchService;
	}


	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "admin/search";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list() {
		List searchs = this.searchService.loadAll();
		return JSONArray.fromObject(searchs).toString();
	}
}
