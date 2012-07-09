package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shop.model.ShopGoods;

public interface GoodsMapper {

	public int getCount();

	public int getTotalByName(String search);

	public List<ShopGoods> loadGoodsByName(int page, int rows, String keywords);

	public List<ShopGoods> loadCatelog(int page, int rows, String keywords);

	public int getTotalByCatelog(String search);

	public int getTotalFilterGoods(@Param("categoryid") int[] categoryids,@Param("isdel")  int isdel,@Param("storenums")  int storenums,@Param("commend") 
			int commend);

	public List<ShopGoods> loadGoodsFilterGoods(@Param("start") int start,@Param("rows")  int rows,
			@Param("categoryids")  int[] categoryids,@Param("isdel")  int isdel,@Param("storenums")  int storenums,@Param("commend")  int commend);

}
