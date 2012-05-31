package com.shop.service.admin;

import java.util.List;

import com.shop.model.ShopRight;

public interface RightService {

	List<ShopRight> loadRights();

	List<ShopRight> loadAll();

}
