package com.shop.service;

import java.util.List;

import com.shop.model.ShopDelivery;

public interface DeliveryService {

	public List<ShopDelivery> loadAll();
	int add(ShopDelivery delivery);
	int update(ShopDelivery delivery);
	int deleteById(int id);
}
