package com.shop.service.admin;

import com.shop.model.ShopRefer;

import java.util.List;

public interface ReferService {

	int getTotal(String username, String goodsname, String starttime,
			String endtime);

	List<ShopRefer> loadRefer(int page, int rows, String username,
			String goodsname, String starttime, String endtime);
	
	/**
	 * 咨询的个数 
	 * @return
	 */
	int getCount();

    /*根据状态取得咨询的个数*/
    int getCountByStatus(int status);
}
