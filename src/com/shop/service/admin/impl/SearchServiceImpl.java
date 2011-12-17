package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.SearchMapper;
import com.shop.service.admin.SearchService;
@Service("searchService")
public class SearchServiceImpl implements SearchService {

	SearchMapper searchMapper;
	@Resource(name="searchMapper")
	public void setSearchMapper(SearchMapper searchMapper) {
		this.searchMapper = searchMapper;
	}


	public List loadAll() {
		return this.searchMapper.loadAll();
	}

}
