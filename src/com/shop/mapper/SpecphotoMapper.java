package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shop.model.ShopSpecPhoto;

public interface SpecphotoMapper extends BaseMapper<ShopSpecPhoto>{

	List<ShopSpecPhoto> loadModel(@Param("start") int start,@Param("rows") int rows);

}
