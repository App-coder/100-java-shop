package com.shop.action.admin;

import javax.annotation.Resource;
import java.util.*;

import net.sf.json.JSONArray;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shop.bean.common.Message;
import com.shop.model.ShopOauth;
import com.shop.service.admin.OauthService;

@Controller
@RequestMapping(value = "admin/oauth")
public class OauthController extends BaseController {
	
	private OauthService oauthService;
	@Resource(name="oauthService")
	public void setOauthService(OauthService oauthService) {
		this.oauthService = oauthService;
	}


	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		List<ShopOauth> oauths = this.oauthService.loadAll();
		return JSONArray.fromObject(oauths).toString();
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(ShopOauth oauth){
		int affectrow = this.oauthService.add(oauth);
		Message message = null;
		if(affectrow == 1){
			message = new Message("true","认证方式添加成功");
		}else{
			message = new Message("false","认证方式添加异常");
		}
		return JSONArray.fromObject(message).toString();
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(ShopOauth oauth){
		int affectrow = this.oauthService.update(oauth);
		Message message = null;
		if(affectrow == 1){
			message = new Message("true","认证方式修改成功");
		}else{
			message = new Message("false","认证方式修改异常");
		}
		return JSONArray.fromObject(message).toString();
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delete(int id){
		int affectrow = this.oauthService.deleteById(id);
		Message message = null;
		if(affectrow == 1){
			message = new Message("true","认证方式删除成功");
		}else{
			message = new Message("false","认证方式删除异常");
		}
		return JSONArray.fromObject(message).toString();	
	}
	
	
	
}
