package com.shop.service.portal;

import java.util.List;

import com.shop.bean.shop.TopCategoryGoods;
import com.shop.model.ShopGoods;

public interface GoodsService {

	List<ShopGoods> loadHotGoods();

	List<ShopGoods> loadNewGoods();

	List<TopCategoryGoods> loadTopCategoryGoods();


}
