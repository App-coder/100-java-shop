package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.ModelMapper;
import com.shop.model.ShopModel;
import com.shop.service.admin.ModelService;

@Service("modelService")
public class ModelServiceImpl implements ModelService{
	
	ModelMapper modelMapper;
	@Resource(name="modelMapper")
	public void setModelMapper(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

	public int getTotal() {
		return this.modelMapper.getTotal();
	}

	public List<ShopModel> loadModel(int page, int rows) {
		int start = (page-1)*rows;
		return this.modelMapper.loadModel(start,rows);
	}

	public int deleteById(int[] ids) {
		return this.modelMapper.deleteById(ids);
	}

}
