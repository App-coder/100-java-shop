package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.SpecphotoMapper;
import com.shop.model.ShopSpecPhoto;
import com.shop.service.admin.SpecphotoService;
@Service("specphotoService")
public class SpecphotoServiceImpl implements SpecphotoService {
	
	SpecphotoMapper specphotoMapper;
	@Resource(name="specphotoMapper")
	public void setSpecphotoMapper(SpecphotoMapper specphotoMapper) {
		this.specphotoMapper = specphotoMapper;
	}

	public int getTotal() {
		return this.specphotoMapper.getTotal();
	}

	public List<ShopSpecPhoto> loadModel(int page, int rows) {
		int start = (page-1)*rows;
		return this.specphotoMapper.loadModel(start,rows);
	}

}
