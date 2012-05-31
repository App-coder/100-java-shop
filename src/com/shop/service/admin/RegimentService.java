package com.shop.service.admin;

import java.util.List;

import com.shop.model.ShopRegiment;

public interface RegimentService {

	int getTotal();

	List<ShopRegiment> loadRegiment(int page, int rows);

	int deleteByIds(int ids);

}
