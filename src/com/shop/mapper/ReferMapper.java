package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shop.model.ShopRefer;

public interface ReferMapper {

	int getCount();

    int getCountByStatus(@Param("status") int status);

	int getTotal(@Param("username") String username,@Param("goodsname") String goodsname,@Param("starttime") String starttime,
			@Param("endtime") String endtime);

	List<ShopRefer> loadRefer(@Param("start") int start,@Param("rows") int rows,@Param("username") String username,
			@Param("goodsname")	String goodsname,@Param("starttime") String starttime,@Param("endtime") String endtime);
}
