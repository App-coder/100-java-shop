package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.SpecMapper;
import com.shop.model.ShopSpec;
import com.shop.service.admin.SpecService;

@Service("specService")
public class SpecServiceImpl implements SpecService {
	
	SpecMapper specMapper;
	@Resource(name="specMapper")
	public void setSpecMapper(SpecMapper specMapper) {
		this.specMapper = specMapper;
	}

	public int getTotal(int isdel) {
		return this.specMapper.getTotal(isdel);
	}

	public List<ShopSpec> loadModel(int page, int rows, int isdel) {
		int start = (page-1)*rows;
		return this.specMapper.loadModel(start,rows,isdel);
	}

}
