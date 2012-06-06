package com.shop.service.admin;

import java.util.List;

import com.shop.model.ShopAccountLog;

public interface AccountlogService {

	int getTotalByEvent(String starttime, String endtime, String event);

	List<ShopAccountLog> loadByEvent(int page, int rows, String starttime,
			String endtime, String event);

	int deleteByMonth(int month);

}
