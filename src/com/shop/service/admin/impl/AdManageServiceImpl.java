package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.AdManageMapper;
import com.shop.model.ShopAdManage;
import com.shop.service.admin.AdManageService;
@Service("adManageService")
public class AdManageServiceImpl implements AdManageService {

	AdManageMapper adManageMapper;
	@Resource(name="adManageMapper")
	public void setAdManageMapper(AdManageMapper adManageMapper) {
		this.adManageMapper = adManageMapper;
	}


	public List<ShopAdManage> loadAll() {
		return this.adManageMapper.loadAll();
	}

}
