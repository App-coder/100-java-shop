package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.SuggestionMapper;
import com.shop.model.ShopSuggestion;
import com.shop.service.admin.SuggestionService;
@Service("suggestionService")
public class SuggestionServiceImpl implements SuggestionService {
	
	SuggestionMapper suggestionMapper;
	@Resource(name="suggestionMapper")
	public void setSuggestionMapper(SuggestionMapper suggestionMapper) {
		this.suggestionMapper = suggestionMapper;
	}

	public int getTotal(String username, String startTime, String endTime) {
		return this.suggestionMapper.getTotal(username,startTime,endTime);
	}

	public List<ShopSuggestion> loadSuggestion(int page, int rows,
			String username, String startTime, String endTime) {
		int start = (page-1)*rows;
		return this.suggestionMapper.loadSuggestion(start,rows,username,startTime,endTime);
	}

	public int deleteByIds(int[] ids) {
		return this.suggestionMapper.deleteByIds(ids);
	}

}
