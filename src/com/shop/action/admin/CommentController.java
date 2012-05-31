package com.shop.action.admin;

import org.springframework.stereotype.Controller;
import java.util.*;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.ListBean;
import com.shop.bean.Message;
import com.shop.model.ShopComment;
import com.shop.service.admin.CommentService;

@Controller
@RequestMapping(value = "admin/comment")
public class CommentController extends BaseController {
	
	CommentService commentService;
	@Resource(name="commentService")
	public void setCommentService(CommentService commentService) {
		this.commentService = commentService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/comment";
	}
	
	/**
	 * 返回评价列表
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
		int total = this.commentService.getTotalFilter(username,goodsname,starttime,endtime);
		List<ShopComment> comments = this.commentService.loadFilter(page,rows,username,goodsname,starttime,endtime);
		
		ListBean list = new ListBean();
		list.setRows(comments);
		list.setTotal(total);
		
		return objToJson(list);
	}
	
	/**
	 * @param page
	 * @param rows
	 * @param searchType 查询类型，username,goodsname
	 * @param keywords
	 * @return
	 */
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ResponseBody
	public String search(int page,int rows,String searchType,String keywords){
		int total = 0;
		List<ShopComment> comments = new ArrayList<ShopComment>();
		
		if(searchType.equals("username")){
			total = this.commentService.getTotalByUsername(keywords);
			comments = this.commentService.loadByUsername(page,rows,keywords);
		}else if(searchType.equals("goodsname")){
			total = this.commentService.getTotalByGoodsname(keywords);
			comments = this.commentService.loadByGoodsname(page,rows,keywords);
		}
		
		ListBean list = new ListBean();
		list.setRows(comments);
		list.setTotal(total);
		
		return objToJson(list);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public String delete(int ids){
		int affectrows = this.commentService.deleteById(ids);
		Message msg = new Message();
		if(affectrows>=1){
			msg.setMessage("商品删除成功！");
			msg.setType("true");
		}else{
			msg.setMessage("商品删除时发生异常！");
			msg.setType("false");
		}
		return objToJson(msg);
	}
	
	
}
