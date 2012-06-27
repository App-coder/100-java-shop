package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shop.model.ShopAreas;

public interface AreasMapper {

	List<ShopAreas> getAreaByParent(@Param("parentid") int parentid);

}
