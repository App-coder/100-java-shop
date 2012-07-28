package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shop.model.ShopMerchShipInfo;

public interface MerchshipinfoMapper extends BaseMapper<ShopMerchShipInfo>{

	int getTotal(@Param("if_del") int if_del);

	List<ShopMerchShipInfo> loadList(@Param("start") int start,@Param("rows") int rows,@Param("if_del") int if_del);

}
