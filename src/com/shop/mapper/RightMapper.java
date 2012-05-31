package com.shop.mapper;

import java.util.List;

import com.shop.model.ShopRight;

public interface RightMapper extends BaseMapper<ShopRight>{

	List<ShopRight> loadRights();

}
