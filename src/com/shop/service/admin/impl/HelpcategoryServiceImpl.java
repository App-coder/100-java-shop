package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.HelpcategoryMapper;
import com.shop.model.ShopHelpCategory;
import com.shop.service.admin.HelpcategoryService;

@Service("helpcategoryService")
public class HelpcategoryServiceImpl implements HelpcategoryService {

	HelpcategoryMapper helpcategoryMapper;
	@Resource(name="helpcategoryMapper")
	public void setHelpcategoryMapper(HelpcategoryMapper helpcategoryMapper) {
		this.helpcategoryMapper = helpcategoryMapper;
	}

	public int getTotal() {
		return this.helpcategoryMapper.getTotal();
	}

	public List<ShopHelpCategory> loadModel(int page, int rows) {
		int start = (page-1)*rows;
		return this.helpcategoryMapper.loadModel(start,rows);
	}

}
