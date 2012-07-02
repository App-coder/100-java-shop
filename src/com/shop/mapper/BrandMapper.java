package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shop.model.ShopBrand;

public interface BrandMapper extends BaseMapper<ShopBrand>{

	List<ShopBrand> loadBrand(@Param("start") int start,@Param("rows") int rows);

	String getCategoryName(@Param("ids") Integer[] ids);
}
