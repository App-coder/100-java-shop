package com.shop.bean.shop;

import com.shop.model.ShopCategory;
import com.shop.model.ShopGoods;

import java.util.*;

public class TopCategoryGoods {
	private ShopCategory category;
	private List<ShopCategory> childs;
	private List<ShopGoods> goods;
	
	public ShopCategory getCategory() {
		return category;
	}
	public void setCategory(ShopCategory category) {
		this.category = category;
	}
	public List<ShopCategory> getChilds() {
		return childs;
	}
	public void setChilds(List<ShopCategory> childs) {
		this.childs = childs;
	}
	public List<ShopGoods> getGoods() {
		return goods;
	}
	public void setGoods(List<ShopGoods> goods) {
		this.goods = goods;
	}
	
}
