package com.shop.test.admin;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.shop.service.admin.OrderService;
import com.shop.service.admin.ReferService;
import com.shop.test.BeanGenerater;

public class ReferServiceTest {
	
	static ReferService referService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		referService = (ReferService)BeanGenerater.getBeanByName("referService");
	}

	@Test
	public void testGetTotal() {
		fail("Not yet implemented");
	}

	@Test
	public void testLoadRefer() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCount() {
		int count = referService.getCount();
	}

}
