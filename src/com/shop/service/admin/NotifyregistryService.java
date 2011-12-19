package com.shop.service.admin;

import java.util.List;

import com.shop.model.ShopNotifyRegistry;

public interface NotifyregistryService {

	int getTotal();

	List<ShopNotifyRegistry> loadList(int page, int rows);

}
