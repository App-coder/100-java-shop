package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shop.model.ShopMessage;

public interface MessageMapper extends BaseMapper<ShopMessage>{

	int getTotal();

	List<ShopMessage> loadList(@Param("start") int start,@Param("rows") int rows);

}
