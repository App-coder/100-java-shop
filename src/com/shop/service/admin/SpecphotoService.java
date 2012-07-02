package com.shop.service.admin;

import java.util.List;

import com.shop.model.ShopSpecPhoto;

public interface SpecphotoService {

	int getTotal();

	List<ShopSpecPhoto> loadModel(int page, int rows);

}
