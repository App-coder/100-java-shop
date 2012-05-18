package com.shop.service;

import java.util.List;

import com.shop.model.ShopTheme;

public interface ThemeService {

	List<ShopTheme> loadAll();

	int insert(ShopTheme theme);

	int update(ShopTheme theme);

	int deleteById(int id);
	
}
