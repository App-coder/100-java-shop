package com.shop.test.admin;

import org.junit.BeforeClass;
import org.junit.Test;
import com.shop.service.admin.GoodsService;
import com.shop.test.BeanGenerater;

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
