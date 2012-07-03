package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shop.model.ShopKeyword;

public interface KeywordMapper extends BaseMapper<ShopKeyword>{

	List<ShopKeyword> loadModel(@Param("start") int start,@Param("rows") int rows);

}
