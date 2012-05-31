package com.shop.service.admin;

import java.util.List;

import com.shop.model.ShopPromotion;

public interface PromotionService {

	int getTotalByType(int type);

	List<ShopPromotion> loadByType(int type);

}
