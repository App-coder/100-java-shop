package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shop.model.ShopRefundmentDoc;

public interface ReturnsdocMapper {

	int getTotal(@Param("if_del") int if_del);

	List<ShopRefundmentDoc> loadList(@Param("start") int start,@Param("rows") int rows,@Param("if_del") int if_del);

}
