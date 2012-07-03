package com.shop.service.admin;

import java.util.List;

import com.shop.model.ShopKeyword;

public interface KeywordService {

	int getTotal();

	List<ShopKeyword> loadModel(int page, int rows);

}
