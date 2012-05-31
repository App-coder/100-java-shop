package com.shop.service.admin;

import java.util.List;
import com.shop.model.ShopSuggestion;

public interface SuggestionService {

	int getTotal(String username, String startTime, String endTime);

	List<ShopSuggestion> loadSuggestion(int page, int rows, String username,
			String startTime, String endTime);

	int deleteByIds(int ids);


}
