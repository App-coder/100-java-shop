package com.shop.service.admin;

import java.util.List;

import com.shop.model.ShopOrder;

public interface OrderService {
	List<ShopOrder> getByCreateTime();

	int getByUsername(String keywords);

	int getByOrderno(String keywords);

	List<ShopOrder> loadByUsername(int page, int rows, String keywords);

	List<ShopOrder> loadByOrderno(int page, int rows, String keywords);

	int getTotalFilter(int pay_status, int distribution_status, int status);

	List<ShopOrder> loadFilter(int page, int rows, int pay_status,
			int distribution_status, int status);
}
