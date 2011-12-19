package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shop.model.ShopNotifyRegistry;

public interface NotifyregistryMapper {

	int getTotal();

	List<ShopNotifyRegistry> loadList(@Param("start") int start,@Param("rows") int rows);

}
