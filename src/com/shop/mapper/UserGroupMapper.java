package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shop.model.ShopUserGroup;

public interface UserGroupMapper extends BaseMapper<ShopUserGroup>{

	List<ShopUserGroup> loadModel(@Param("start")  int start,@Param("rows") int rows);

}
