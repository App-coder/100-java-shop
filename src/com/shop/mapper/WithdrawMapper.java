package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shop.model.ShopWithdraw;

public interface WithdrawMapper extends BaseMapper<ShopWithdraw>{

	List loadWithdraw(@Param("start") int start,@Param("rows") int rows);

}
