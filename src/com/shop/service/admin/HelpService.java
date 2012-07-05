package com.shop.service.admin;

import java.util.List;

import com.shop.model.ShopHelp;

public interface HelpService {

	int getTotal();

	List<ShopHelp> loadModel(int page, int rows);

}
