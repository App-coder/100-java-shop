package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.GoodsMapper;
import com.shop.model.ShopGoods;
import com.shop.service.admin.GoodsService;
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
	
	GoodsMapper goodsMapper;
	@Resource(name="goodsMapper")
	public void setGoodsMapper(GoodsMapper goodsMapper) {
		this.goodsMapper = goodsMapper;
	}

	public int getTotalByName(String search) {
		return this.goodsMapper.getTotalByName(search);
	}

	public List<ShopGoods> loadGoodsByName(int page, int rows, String keywords) {
		return this.goodsMapper.loadGoodsByName(page,rows,keywords);
	}

	public List<ShopGoods> loadCatelog(int page, int rows, String keywords) {
		return this.goodsMapper.loadCatelog(page,rows,keywords);
	}

	public int getTotalByCatelog(String search) {
		return this.goodsMapper.getTotalByCatelog(search);
	}

	public int getTotalFilterGoods(int categoryid, int isdel, int storenums,
			int commend) {
		return this.goodsMapper.getTotalFilterGoods(categoryid,isdel,storenums,commend);
	}

	public List<ShopGoods> loadGoodsFilterGoods(int page, int rows,int categoryid, int isdel,
			int storenums, int commend) {
		int start = (page-1)*rows;
		return this.goodsMapper.loadGoodsFilterGoods(start,rows,categoryid,isdel,storenums,commend);
	}

	public int deleteByIds(int[] ids) {
		return 0;
	}

	public int updateIsDel(int[] ids, int isdel) {
		return 0;
	}

	public int getCount() {
		return this.goodsMapper.getCount();
	}


}
