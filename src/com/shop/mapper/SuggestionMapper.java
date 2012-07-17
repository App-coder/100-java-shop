package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shop.model.ShopSuggestion;

public interface SuggestionMapper extends BaseMapper<ShopSuggestion>{

	int getTotal(@Param("username") String username,@Param("startTime") String startTime,@Param("endTime") String endTime);

	List<ShopSuggestion> loadSuggestion(@Param("start") int start,@Param("rows") int rows,@Param("username") String username,
			String startTime, String endTime);

	int deleteByIds(@Param("ids") int[] ids);

}
