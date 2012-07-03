package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shop.model.ShopMember;

public interface MemberMapper extends BaseMapper<ShopMember> {

	int getTotalByState(@Param("state") int state);

	List<ShopMember> loadModelByState(@Param("start") int start,@Param("rows") int rows,@Param("status") int status);


}
