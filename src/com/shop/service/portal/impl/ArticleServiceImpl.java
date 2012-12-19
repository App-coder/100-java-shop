package com.shop.service.portal.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.ArticleMapper;
import com.shop.model.ShopArticle;
import com.shop.service.portal.ArticleService;
@Service("portal_articleService")
public class ArticleServiceImpl implements ArticleService {
	
	ArticleMapper articleMapper;
	@Resource(name="articleMapper")
	public void setArticleMapper(ArticleMapper articleMapper) {
		this.articleMapper = articleMapper;
	}

	public List<ShopArticle> load(int loadnum) {
		return this.articleMapper.load(loadnum);
	}

	public int getTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<ShopArticle> loadList(int page, int rows) {
		// TODO Auto-generated method stub
		return null;
	}

}
