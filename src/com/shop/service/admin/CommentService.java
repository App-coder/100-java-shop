package com.shop.service.admin;

import com.shop.model.ShopComment;

import java.util.List;

public interface CommentService {

	int getTotalFilter(String username, String goodsname, String starttime,
			String endtime);

	List<ShopComment> loadFilter(int page, int rows, String username,
			String goodsname, String starttime, String endtime);

	List<ShopComment> loadByUsername(int page, int rows, String keywords);

	int getTotalByUsername(String keywords);

	int getTotalByGoodsname(String keywords);

	List<ShopComment> loadByGoodsname(int page, int rows, String keywords);

	int deleteById(int ids);

    /*根据状态得到评论*/
    int getCount(int status);
}
