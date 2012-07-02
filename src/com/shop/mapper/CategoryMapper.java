package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shop.model.ShopCategory;

public interface CategoryMapper {

	List<ShopCategory> getCategoryByParent(@Param("pid") int pid);

}
