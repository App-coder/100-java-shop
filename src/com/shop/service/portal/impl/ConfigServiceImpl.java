package com.shop.service.portal.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.ConfigMapper;
import com.shop.model.ShopConfig;
import com.shop.service.portal.ConfigService;
@Service("portal_configService")
public class ConfigServiceImpl implements ConfigService {

	ConfigMapper configMapper;
	@Resource(name="configMapper")
	public void setShopConfigMapper(ConfigMapper shopConfigMapper) {
		this.configMapper = shopConfigMapper;
	}
	public List<ShopConfig> getAll() {
		return this.configMapper.getAll();
	}
}
