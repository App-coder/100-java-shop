package com.shop.service.admin.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.model.ShopRefer;
import com.shop.service.admin.ReferService;
@Service("referService")
public class ReferServiceImpl implements ReferService {

	public int getTotal(String username, String goodsname, String starttime,
			String endtime) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<ShopRefer> loadRefer(int page, int rows, String username,
			String goodsname, String starttime, String endtime) {
		// TODO Auto-generated method stub
		return null;
	}

}
