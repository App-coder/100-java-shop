package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.AreasMapper;
import com.shop.model.ShopAreas;
import com.shop.service.admin.AreasService;
@Service("areasService")
public class AreasServiceImpl implements AreasService{

	AreasMapper areasMapper;
	@Resource(name="areasMapper")
	public void setAreasMapper(AreasMapper areasMapper) {
		this.areasMapper = areasMapper;
	}


	@Override
	public List<ShopAreas> getAreaByParent(int parentid) {
		return this.areasMapper.getAreaByParent(parentid);
	}

}
