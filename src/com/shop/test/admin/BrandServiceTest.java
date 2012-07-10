package com.shop.test.admin;

import org.junit.BeforeClass;
import org.junit.Test;

import com.shop.service.admin.BrandService;
import com.shop.test.BeanGenerater;

public class BrandServiceTest {
	
	static BrandService brandService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		brandService = (BrandService)BeanGenerater.getBeanByName("brandService");
	}

	@Test
	public void testLoadBrand() {
		this.brandService.loadBrand(1, 10);
	}
	
	@Test
	public void testGetCategoryName(){
		this.brandService.getCategoryName(new Integer[]{3,10});
	}
	
}
