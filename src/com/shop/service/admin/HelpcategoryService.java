package com.shop.service.admin;

import java.util.List;

import com.shop.model.ShopHelpCategory;

public interface HelpcategoryService {

	int getTotal();

	List<ShopHelpCategory> loadModel(int page, int rows);

}
