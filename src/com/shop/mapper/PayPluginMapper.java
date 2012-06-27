package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shop.model.ShopPayPlugin;

public interface PayPluginMapper {

	List<ShopPayPlugin> loadPayPluginsByVisibility(@Param("visibility") int visibility);
	List<ShopPayPlugin> loadPayment();

}
