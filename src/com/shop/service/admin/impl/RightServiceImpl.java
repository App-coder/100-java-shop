package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.RightMapper;
import com.shop.model.ShopRight;
import com.shop.service.admin.RightService;
@Service("rightService")
public class RightServiceImpl implements RightService {

	private RightMapper rightMapper;
	@Resource(name="rightMapper")
	public void setShopRightMapper(RightMapper rightMapper) {
		this.rightMapper = rightMapper;
	}


	public List<ShopRight> loadRights() {
		return this.rightMapper.loadRights();
	}


	public List<ShopRight> loadAll() {
		return this.rightMapper.loadAll();
	}

}
