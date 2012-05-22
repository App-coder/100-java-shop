package com.shop.mapper;

import com.shop.model.ShopDelivery;

public interface DeliveryMapper extends BaseMapper<ShopDelivery> {

	int deleteById(int id);

}
