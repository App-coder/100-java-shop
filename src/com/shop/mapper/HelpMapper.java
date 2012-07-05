package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shop.model.ShopHelp;

public interface HelpMapper extends BaseMapper<ShopHelp>{

	List<ShopHelp> loadModel(@Param("start") int start,@Param("rows") int rows);

}
