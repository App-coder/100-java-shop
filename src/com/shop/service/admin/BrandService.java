package com.shop.service.admin;

import java.util.List;

import com.shop.model.ShopBrand;

public interface BrandService {

	int getTotal();

	List<ShopBrand> loadBrand(int page, int rows);

}
