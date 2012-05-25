package com.shop.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.ShopRightMapper;
import com.shop.model.ShopRight;
import com.shop.service.ShopRightService;
@Service("shopRightService")
public class ShopRightServiceImpl implements ShopRightService {

	private ShopRightMapper shopRightMapper;
	@Resource(name="shopRightMapper")
	public void setShopRightMapper(ShopRightMapper shopRightMapper) {
		this.shopRightMapper = shopRightMapper;
	}


	public List<ShopRight> loadRights() {
		return this.shopRightMapper.loadRights();
	}

}
