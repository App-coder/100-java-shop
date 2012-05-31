package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.ThemeMapper;
import com.shop.model.ShopTheme;
import com.shop.service.admin.ThemeService;
@Service("themeService")
public class ThemeServiceImpl implements ThemeService {

	private ThemeMapper themeMapper;
	@Resource(name="themeMapper")
	public void setThemeMapper(ThemeMapper themeMapper) {
		this.themeMapper = themeMapper;
	}


	public List<ShopTheme> loadAll() {
		return this.themeMapper.loadAll();
	}


	public int insert(ShopTheme theme) {
		return this.themeMapper.insert(theme);
	}


	public int update(ShopTheme theme) {
		return this.themeMapper.update(theme);
	}


	public int deleteById(int id) {
		return this.themeMapper.deleteById(id);
	}

}
