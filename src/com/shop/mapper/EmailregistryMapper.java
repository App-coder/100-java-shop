package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shop.model.ShopEmailRegistry;

public interface EmailregistryMapper extends BaseMapper<ShopEmailRegistry>{

	int getTotal();

	List<ShopEmailRegistry> loadList(@Param("start") int start,@Param("rows") int rows);

}
