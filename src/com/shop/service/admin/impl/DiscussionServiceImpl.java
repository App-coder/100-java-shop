package com.shop.service.admin.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.model.ShopDiscussion;
import com.shop.service.admin.DiscussionService;
@Service("discussionService")
public class DiscussionServiceImpl implements DiscussionService {

	public int getTotalFilterDiscussion(String username, String goodsname,
			String starttime, String endtime) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<ShopDiscussion> loadDiscussionInFilter(int page, int rows,
			String username, String goodsname, String starttime, String endtime) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getTotalByUsername(String keywords) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<ShopDiscussion> loadByUsername(int page, int rows,
			String keywords) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getTotalByGoodsname(String keywords) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<ShopDiscussion> loadByGoodsname(String keywords) {
		// TODO Auto-generated method stub
		return null;
	}

}
