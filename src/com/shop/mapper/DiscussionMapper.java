package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shop.model.ShopDiscussion;

public interface DiscussionMapper {

	List<ShopDiscussion> loadDiscussionInFilter(@Param("start") int start,@Param("rows") int rows,
			@Param("username")	String username,@Param("goodsname") String goodsname,@Param("starttime") String starttime,@Param("endtime") String endtime);

	int getTotalByUsername(@Param("keywords") String keywords);

	List<ShopDiscussion> loadByUsername(@Param("start") int start,@Param("rows") int rows,@Param("keywords") String keywords);

	int getTotalByGoodsname(@Param("keywords") String keywords);

	List<ShopDiscussion> loadByGoodsname(@Param("start") int start,@Param("rows") int rows,@Param("keywords") String keywords);

	int getTotalFilterDiscussion(@Param("username") String username,@Param("goodsname") String goodsname,
			@Param("starttime") String starttime,@Param("endtime") String endtime);

}
