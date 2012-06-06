package com.shop.service.admin;

import java.util.List;

import com.shop.model.ShopLogOperation;

public interface LogoperationService {

	int getTotal(String starttime, String endtime);

	List<ShopLogOperation> loadOperations(int page, int rows, String starttime,
			String endtime);

}
