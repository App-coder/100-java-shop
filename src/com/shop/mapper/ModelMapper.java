package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shop.model.ShopModel;

public interface ModelMapper extends BaseMapper<ShopModel>{

	List<ShopModel> loadModel(@Param("start") int start,@Param("rows") int rows);

	int deleteById(int[] ids);

}
