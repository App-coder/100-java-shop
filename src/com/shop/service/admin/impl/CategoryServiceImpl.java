package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.CategoryMapper;
import com.shop.model.ShopCategory;
import com.shop.service.admin.CategoryService;
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
	
	CategoryMapper categoryMapper;
	@Resource(name="categoryMapper")
	public void setCategoryMapper(CategoryMapper categoryMapper) {
		this.categoryMapper = categoryMapper;
	}

	public List<ShopCategory> loadAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public int add(ShopCategory category) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(ShopCategory category) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<ShopCategory> getCategoryByParent(int pid) {
		return this.categoryMapper.getCategoryByParent(pid);
	}

}
