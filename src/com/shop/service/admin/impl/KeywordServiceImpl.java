package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.KeywordMapper;
import com.shop.model.ShopKeyword;
import com.shop.service.admin.KeywordService;
@Service("keywordService")
public class KeywordServiceImpl implements KeywordService {
	
	KeywordMapper keywordMapper;
	@Resource(name="keywordMapper")
	public void setKeywordMapper(KeywordMapper keywordMapper) {
		this.keywordMapper = keywordMapper;
	}

	public int getTotal() {
		return this.keywordMapper.getTotal();
	}

	public List<ShopKeyword> loadModel(int page, int rows) {
		int start = (page-1)*rows;
		return this.keywordMapper.loadModel(start,rows);
	}

}
