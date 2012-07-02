package com.shop.service.admin;

import java.util.List;

import com.shop.model.ShopModel;

public interface ModelService {

	int getTotal();

	List<ShopModel> loadModel(int page, int rows);

	int deleteById(int[] ids);

}
