package com.shop.service.admin.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.model.ShopLogOperation;
import com.shop.service.admin.LogoperationService;
@Service("logoperationService")
public class LogoperationServiceImpl implements LogoperationService {

	public int getTotal(String starttime, String endtime) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<ShopLogOperation> loadOperations(int page, int rows,
			String starttime, String endtime) {
		// TODO Auto-generated method stub
		return null;
	}

}
