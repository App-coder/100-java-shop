package com.shop.service.admin;

import java.util.List;

import com.shop.model.ShopEmailRegistry;

public interface EmailregistryService {

	int getTotal();

	List<ShopEmailRegistry> loadList(int page, int rows);

}
