package com.shop.service.admin;

import java.util.List;


import com.shop.model.ShopArticle;

public interface ArticleService {
	List<ShopArticle> load(int loadnum);
}
