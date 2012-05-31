package com.shop.service.admin;

import java.util.List;

import com.shop.model.ShopRefer;

public interface ReferService {

	int getTotal(String username, String goodsname, String starttime,
			String endtime);

	List<ShopRefer> loadRefer(int page, int rows, String username,
			String goodsname, String starttime, String endtime);

}
