package com.shop.action.admin;

import javax.annotation.Resource;
import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.easyui.ListBean;
import com.shop.model.ShopDiscussion;
import com.shop.service.admin.DiscussionService;

@Controller
@RequestMapping(value = "admin/discussion")
public class DiscussionController extends BaseController {
	
	DiscussionService discussionService;
	@Resource(name="discussionService")
	public void setDiscussionService(DiscussionService discussionService) {
		this.discussionService = discussionService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/discussion";
	}
	
	/**
	 * 
	 * 返回讨论信息列表
	 * 
	 * @param page
	 * @param rows
	 * @param username
	 * @param goodsname
	 * @param starttime
	 * @param endtime
	 * @return
	 */
	@RequestMapping(value = "/filter", method = RequestMethod.POST)
	@ResponseBody
	public String filter(int page,int rows,String username,String goodsname,String starttime,String endtime){
		int total = this.discussionService.getTotalFilterDiscussion(username,goodsname,starttime,endtime);
		List<ShopDiscussion> discussions = this.discussionService.loadDiscussionInFilter(page,rows,username,goodsname,starttime,endtime);
		
		ListBean list = new ListBean();
		list.setRows(discussions);
		list.setTotal(total);
		
		return objToJson(list);
	}
	
	/**
	 * 快速查询
	 * 
	 * @param page
	 * @param rows
	 * @param searchType 查询类型 username,goodsname
	 * @param keywords
	 * @return
	 */
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ResponseBody
	public String search(int page,int rows,String searchType,String keywords){
		int total = 0;
		List<ShopDiscussion> discussions = new ArrayList<ShopDiscussion>();
		if(searchType.equals("username")){
			total = this.discussionService.getTotalByUsername(keywords);
			discussions = this.discussionService.loadByUsername(page,rows,keywords);
		}else if(searchType.equals("goodsname")){
			total = this.discussionService.getTotalByGoodsname(keywords);
			discussions = this.discussionService.loadByGoodsname(keywords);
		}
		
		ListBean list = new ListBean();
		list.setRows(discussions);
		list.setTotal(total);
		
		return objToJson(list);
	}
	
}
