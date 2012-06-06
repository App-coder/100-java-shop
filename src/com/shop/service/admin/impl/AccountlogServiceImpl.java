package com.shop.service.admin.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.model.ShopAccountLog;
import com.shop.service.admin.AccountlogService;
@Service("accountlogService")
public class AccountlogServiceImpl implements AccountlogService {

	public int getTotalByEvent(String starttime, String endtime, String event) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<ShopAccountLog> loadByEvent(int page, int rows,
			String starttime, String endtime, String event) {
		// TODO Auto-generated method stub
		return null;
	}

	public int deleteByMonth(int month) {
		// TODO Auto-generated method stub
		return 0;
	}

}
