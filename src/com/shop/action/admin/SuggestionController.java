package com.shop.action.admin;

import javax.annotation.Resource;
import java.util.*;

import net.sf.json.JsonConfig;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.common.Message;
import com.shop.bean.easyui.ListBean;
import com.shop.model.ShopSuggestion;
import com.shop.service.admin.SuggestionService;
import com.shop.util.JsonDateValueProcessor;

@Controller
@RequestMapping(value = "admin/suggestion")
public class SuggestionController extends BaseController {
	
	SuggestionService suggestionService;
	@Resource(name="suggestionService")
	public void setSuggestionService(SuggestionService suggestionService) {
		this.suggestionService = suggestionService;
	}
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/suggestion";
	}
	
	
	/**
	 * 返回意见的列表
	 * 
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String filter(int page,int rows,String username,String startTime,String endTime){
		int total = this.suggestionService.getTotal(username,startTime,endTime);
		List<ShopSuggestion> suggestions = this.suggestionService.loadSuggestion(page,rows,username,startTime,endTime);
		ListBean bean = new ListBean();
		bean.setTotal(total);
		bean.setRows(suggestions);
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new JsonDateValueProcessor("yyyy-MM-dd HH:mm:ss"));
		return objToJson(bean,jsonConfig);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	@ResponseBody
	public String delete(int[] ids){
		int affectrows = this.suggestionService.deleteByIds(ids);
		
		Message msg = new Message();
		if(affectrows>=1){
			msg.setMessage("意见信息删除成功！");
			msg.setType("true");
		}else{
			msg.setMessage("意见信息删除时发生异常！");
			msg.setType("false");
		}
		return objToJson(msg);
		
	}
	
	
	
}
