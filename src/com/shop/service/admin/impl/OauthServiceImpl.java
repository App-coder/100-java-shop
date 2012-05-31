package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.OauthMapper;
import com.shop.model.ShopOauth;
import com.shop.service.admin.OauthService;
@Service("oauthService")
public class OauthServiceImpl implements OauthService {

	OauthMapper oauthMapper;
	@Resource(name="oauthMapper")
	public void setOauthMapper(OauthMapper oauthMapper) {
		this.oauthMapper = oauthMapper;
	}

	public List<ShopOauth> loadAll() {
		return this.oauthMapper.loadAll();
	}

	public int add(ShopOauth oauth) {
		return this.oauthMapper.insert(oauth);
	}

	public int update(ShopOauth oauth) {
		return this.oauthMapper.update(oauth);
	}

	public int deleteById(int id) {
		return this.oauthMapper.deleteById(id);
	}

}
