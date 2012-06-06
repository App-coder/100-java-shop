package com.shop.action.admin;

import javax.annotation.Resource;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.common.Message;
import com.shop.model.ShopTheme;
import com.shop.service.admin.ConfigService;
import com.shop.service.admin.ThemeService;

import java.util.*;

@Controller
@RequestMapping(value="admin/theme")
public class ThemeController extends BaseController {
	
	private ConfigService configService;
	@Resource(name = "configService")
	public void setConfigService(ConfigService configService) {
		this.configService = configService;
	}
	
	private ThemeService themeService;
	@Resource(name="themeService")
	public void setThemeService(ThemeService themeService) {
		this.themeService = themeService;
	}


	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(){
		return "admin/theme";
	}
	
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	@ResponseBody
	public String list(){
		List<ShopTheme> themes = this.themeService.loadAll();
		return JSONArray.fromObject(themes).toString();
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	@ResponseBody
	public String add(ShopTheme theme){
		int affectrow = this.themeService.insert(theme);
		Message message = null;
		if(affectrow == 1){
			message = new Message("true","主题添加成功");
		}else{
			message = new Message("false","主题添加异常");
		}
		return JSONArray.fromObject(message).toString();
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	@ResponseBody
	public String update(ShopTheme theme){
		int affectrow = this.themeService.update(theme);
		Message message = null;
		if(affectrow == 1){
			message = new Message("true","主题修改成功");
		}else{
			message = new Message("false","主题修改异常");
		}
		return JSONArray.fromObject(message).toString();
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	@ResponseBody
	public String delete(int id){
		int affectrow = this.themeService.deleteById(id);
		Message message = null;
		if(affectrow == 1){
			message = new Message("true","主题删除成功");
		}else{
			message = new Message("false","主题删除异常");
		}
		return JSONArray.fromObject(message).toString();
	}
	
	@RequestMapping(value="/cfg_theme", method=RequestMethod.GET)
	@ResponseBody
	public String cfg_theme(String theme){
		this.configService.updateConfig("theme", theme);
		Message message = new Message("true","主题配置成功");
		return JSONObject.fromObject(message).toString();
	}
	
}
