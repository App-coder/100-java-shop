package com.shop.service.admin;

import java.util.List;

import com.shop.model.ShopMessage;

public interface MessageService {

	int getTotal();

	List<ShopMessage> loadList(int page, int rows);

}
