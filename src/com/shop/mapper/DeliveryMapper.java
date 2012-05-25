package com.shop.mapper;

import org.apache.ibatis.annotations.Param;

import com.shop.model.ShopDelivery;

public interface DeliveryMapper extends BaseMapper<ShopDelivery> {

	int deleteById(@Param("id") int id);

}
