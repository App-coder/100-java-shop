package com.shop.service.admin.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.model.ShopSuggestion;
import com.shop.service.admin.SuggestionService;
@Service("suggestionService")
public class SuggestionServiceImpl implements SuggestionService {

	public int getTotal(String username, String startTime, String endTime) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<ShopSuggestion> loadSuggestion(int page, int rows,
			String username, String startTime, String endTime) {
		// TODO Auto-generated method stub
		return null;
	}

	public int deleteByIds(int ids) {
		// TODO Auto-generated method stub
		return 0;
	}

}
