package com.shop.action;

public class BaseController {
	
	public String getTitle(String name,String title){
		if(title!=null){
			return name+"-"+title;
		}else{
			return name;
		}
	}
}
