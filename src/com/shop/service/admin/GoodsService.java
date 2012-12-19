package com.shop.service.admin;

import java.util.List;

import com.shop.model.ShopGoods;

public interface GoodsService {

	int getTotalByName(String search);

	List<ShopGoods> loadGoodsByName(int page, int rows, String keywords);

	List<ShopGoods> loadCatelog(int page, int rows, String keywords);

	int getTotalByCatelog(String search);

	int getTotalFilterGoods(int categoryid, int isdel, int storenums,
			int commend);

	List<ShopGoods> loadGoodsFilterGoods(int categoryid, int isdel,
			int storenums, int commend);

	int deleteByIds(int[] ids);

	int updateIsDel(int[] ids, int isdel);
	
	int getCount();

	


}
