package com.shop.action.admin;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.easyui.ListBean;
import com.shop.model.ShopKeyword;
import com.shop.service.admin.KeywordService;

@Controller
@RequestMapping(value = "admin/keyword")
public class KeywordController extends BaseController {
	
	KeywordService keywordService;
	@Resource(name="keywordService")
	public void setKeywordService(KeywordService keywordService) {
		this.keywordService = keywordService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/keyword";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list(@RequestParam("page") int page,@RequestParam("rows") int rows){
		int total = this.keywordService.getTotal();
		List<ShopKeyword> models = this.keywordService.loadModel(page,rows);
		ListBean list = new ListBean();
		list.setRows(models);
		list.setTotal(total);
		return objToJson(list);
	}
	
	
	
}
