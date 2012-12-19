package com.shop.mapper;

import com.shop.model.ShopGuide;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GuideMapper extends BaseMapper<ShopGuide>{
	int updateOrder(@Param("new_order") int new_order,@Param("order") int order);
	ShopGuide getByOrder(@Param("order") int order);
	int deleteGuideByOrder(@Param("order") int order);
	int getMaxOrder();
    List<ShopGuide> loadGuides();
}
