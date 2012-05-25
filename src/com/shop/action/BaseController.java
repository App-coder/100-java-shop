package com.shop.action;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

public class BaseController {
	
	public String getTitle(String name,String title){
		if(title!=null){
			return name+"-"+title;
		}else{
			return name;
		}
	}
	
	public String objToJson(Object o,JsonConfig cfg){
		return JSONObject.fromObject(o,cfg).toString();
	}
	
	public String arrayToJson(Object o,JsonConfig cfg){
		return JSONArray.fromObject(o,cfg).toString();
	}
}
