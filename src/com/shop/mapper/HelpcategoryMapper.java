package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shop.model.ShopHelpCategory;

public interface HelpcategoryMapper extends BaseMapper<ShopHelpCategory>{

	List<ShopHelpCategory> loadModel(@Param("start") int start,@Param("rows") int rows);

}
