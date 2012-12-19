package com.shop.action.portal;

public class BaseController {
	
	// 根据主题后返回对应页面的String
	public String getPage(String page,String theme) {
		return "portal/"+theme+"/" + page;
	}
	
	public String getTitle(String name,String title){
		if(title!=null){
			return name+"-"+title;
		}else{
			return name;
		}
	}
}
