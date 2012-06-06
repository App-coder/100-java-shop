package com.shop.test.admin;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.shop.service.admin.GoodsService;

import junit.framework.TestCase;

public class GoodsServiceTest extends TestCase {

	GoodsService goodsService;

	public void init() {
		ApplicationContext aCtx = new FileSystemXmlApplicationContext(
				"classpath:spring.xml");
		GoodsService service = (GoodsService) aCtx.getBean("goodsService");
		assertNotNull(service);
		this.goodsService = service;
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

}
