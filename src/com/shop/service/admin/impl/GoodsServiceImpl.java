package com.shop.service.admin.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.model.ShopGoods;
import com.shop.service.admin.GoodsService;
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {

	public int getTotalByName(String search) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<ShopGoods> loadGoodsByName(int page, int rows, String keywords) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ShopGoods> loadCatelog(int page, int rows, String keywords) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getTotalByCatelog(String search) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getTotalFilterGoods(int categoryid, int isdel, int storenums,
			int commend) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<ShopGoods> loadGoodsFilterGoods(int categoryid, int isdel,
			int storenums, int commend) {
		// TODO Auto-generated method stub
		return null;
	}

	public int deleteByIds(int[] ids) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateIsDel(int[] ids, int isdel) {
		// TODO Auto-generated method stub
		return 0;
	}

}
