package com.shop.action.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "admin/tools")
public class ToolsController extends BaseController {
	
	/**
	 * 数据库备份
	 * 
	 * @return
	 */
	public String db_bak(){
		return "tools/db_bak";
	}
	
	/**
	 * 数据库还原
	 * 
	 * @return
	 */
	public String db_res(){
		return "tools/db_res";
	}
	
	
	
	
}
