package com.shop.service.admin.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.model.ShopComment;
import com.shop.service.admin.CommentService;
@Service("commentService")
public class CommentServiceImpl implements CommentService {

	public int getTotalFilter(String username, String goodsname,
			String starttime, String endtime) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<ShopComment> loadFilter(int page, int rows, String username,
			String goodsname, String starttime, String endtime) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ShopComment> loadByUsername(int page, int rows, String keywords) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getTotalByUsername(String keywords) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getTotalByGoodsname(String keywords) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<ShopComment> loadByGoodsname(int page, int rows, String keywords) {
		// TODO Auto-generated method stub
		return null;
	}

	public int deleteById(int ids) {
		// TODO Auto-generated method stub
		return 0;
	}

}
