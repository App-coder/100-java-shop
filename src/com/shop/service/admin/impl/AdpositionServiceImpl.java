package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.AdpositionMapper;
import com.shop.model.ShopAdPosition;
import com.shop.service.admin.AdpositionService;
@Service("adpositionService")
public class AdpositionServiceImpl implements AdpositionService {
	
	AdpositionMapper adpositionMapper;
	@Resource(name="adpositionMapper")
	public void setAdpositionMapper(AdpositionMapper adpositionMapper) {
		this.adpositionMapper = adpositionMapper;
	}


	public List<ShopAdPosition> loadAll() {
		return this.adpositionMapper.loadAll();
	}

}
