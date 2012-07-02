package com.shop.service.admin.impl;

import java.util.List;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.BrandMapper;
import com.shop.model.ShopBrand;
import com.shop.service.admin.BrandService;
import com.shop.util.JsonUtil;

@Service("brandService")
public class BrandServiceImpl implements BrandService {
	
	BrandMapper brandMapper;
	@Resource(name="brandMapper")
	public void setBrandMapper(BrandMapper brandMapper) {
		this.brandMapper = brandMapper;
	}

	public int getTotal() {
		return this.brandMapper.getTotal();
	}

	public List<ShopBrand> loadBrand(int page, int rows) {
		int start = (page-1)*rows;
		List<ShopBrand> brands = this.brandMapper.loadBrand(start,rows);
		for(ShopBrand brand : brands){
			if(brand.getCategoryIds()!=null){
				JsonUtil.getIntegerArray4Json("["+brand.getCategoryIds()+"]");
				brand.setCategoryname(this.brandMapper.getCategoryName(JsonUtil.getIntegerArray4Json("["+brand.getCategoryIds()+"]")));
			}
		}
		return brands;
	}



}
