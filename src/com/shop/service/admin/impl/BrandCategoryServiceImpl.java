package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.BrandCategoryMapper;
import com.shop.model.ShopBrandCategory;
import com.shop.service.admin.BrandCategoryService;
@Service("brandCategoryService")
public class BrandCategoryServiceImpl implements BrandCategoryService {
	
	BrandCategoryMapper brandCategoryMapper;
	@Resource(name="brandCategoryMapper")
	public void setBrandCategoryMapper(BrandCategoryMapper brandCategoryMapper) {
		this.brandCategoryMapper = brandCategoryMapper;
	}

	public List<ShopBrandCategory> loadAll() {
		return this.brandCategoryMapper.loadAll();
	}

	public int update(ShopBrandCategory brandCategory) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int add(ShopBrandCategory brandCategory) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteById(int ids) {
		// TODO Auto-generated method stub
		return 0;
	}

}
