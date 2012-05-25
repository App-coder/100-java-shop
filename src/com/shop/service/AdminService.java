package com.shop.service;

import java.util.List;

import com.shop.model.ShopAdmin;

public interface AdminService {
	ShopAdmin findByName(String adminName);

	List<ShopAdmin> loadByIsDel(int i);
}
