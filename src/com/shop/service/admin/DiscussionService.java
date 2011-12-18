package com.shop.service.admin;

import java.util.List;

import com.shop.model.ShopDiscussion;

public interface DiscussionService {

	int getTotalFilterDiscussion(String username, String goodsname,
			String starttime, String endtime);

	List<ShopDiscussion> loadDiscussionInFilter(int page, int rows,
			String username, String goodsname, String starttime, String endtime);

	int getTotalByUsername(String keywords);

	List<ShopDiscussion> loadByUsername(int page, int rows, String keywords);

	int getTotalByGoodsname(String keywords);

	List<ShopDiscussion> loadByGoodsname(int page, int rows, String keywords);

}
