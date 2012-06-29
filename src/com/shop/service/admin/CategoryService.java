package com.shop.service.admin;

import java.util.List;

import com.shop.model.ShopCategory;

public interface CategoryService {

	List<ShopCategory> loadAll();

	int add(ShopCategory category);

	int update(ShopCategory category);

	int deleteById(int id);

	List<ShopCategory> getCategoryByParent(int pid);

}
