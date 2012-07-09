package com.shop.test.admin;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.shop.model.ShopGoods;
import com.shop.service.admin.GoodsService;
import com.shop.test.BeanGenerater;
import com.shop.util.JsonUtil;
import com.shop.util.StringUtil;

public class GoodsServiceTest {

	static GoodsService goodsService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		goodsService = (GoodsService)BeanGenerater.getBeanByName("goodsService");
	}

	@Test
	public void testGetTotalByName() {
		
		
	}

	@Test
	public void testLoadGoodsByName() {
	}

	@Test
	public void testLoadCatelog() {
	}

	@Test
	public void testGetTotalByCatelog() {
	}

	@Test
	public void testGetTotalFilterGoods() {
	}

	@Test
	public void testLoadGoodsFilterGoods() {
		List<ShopGoods> goods = this.goodsService.loadGoodsFilterGoods(1, 10, 10, 0, 101, 0);
		
	}

	@Test
	public void testDeleteByIds() {
	}

	@Test
	public void testUpdateIsDel() {
	}
	
	@Test
	public void getCount(){
		int count = this.goodsService.getCount();
	}

}
