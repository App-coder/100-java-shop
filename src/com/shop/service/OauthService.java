package com.shop.service;

import java.util.List;

import com.shop.model.ShopOauth;

public interface OauthService {

	List<ShopOauth> loadAll();

	int add(ShopOauth oauth);

	int update(ShopOauth oauth);

	int deleteById(int id);

}
