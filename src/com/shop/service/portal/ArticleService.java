package com.shop.service.portal;

import java.util.List;

import com.shop.model.ShopArticle;

public interface ArticleService {
	List<ShopArticle> load(int loadnum);

	int getTotal();

	List<ShopArticle> loadList(int page, int rows);
}
