package com.shop.mapper;

import com.shop.model.ShopTheme;
import java.util.*;

public interface ThemeMapper extends BaseMapper<ShopTheme>{
	List<ShopTheme> loadAll();
	int deleteById(int id);
}
