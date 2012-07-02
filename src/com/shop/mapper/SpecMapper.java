package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shop.model.ShopSpec;

public interface SpecMapper extends BaseMapper<ShopSpec>{

	int getTotal(@Param("isdel") int isdel);

	List<ShopSpec> loadModel(@Param("start") int start,@Param("rows") int rows,@Param("isdel") int isdel);

}
