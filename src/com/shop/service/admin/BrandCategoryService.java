package com.shop.service.admin;

import java.util.List;

import com.shop.model.ShopBrandCategory;

public interface BrandCategoryService {

	List<ShopBrandCategory> loadAll();

	int update(ShopBrandCategory brandCategory);

	int add(ShopBrandCategory brandCategory);

	int deleteById(int ids);

}
