package com.shop.test.admin;

import static org.junit.Assert.*;
import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mybatis.spring.mapper.MapperScannerConfigurer;

import com.shop.model.ShopOrder;
import com.shop.service.admin.OrderService;
import com.shop.test.BeanGenerater;
import java.util.*;

public class OrderServiceTest{

	static OrderService orderService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		orderService = (OrderService)BeanGenerater.getBeanByName("orderService");
	}
	
	 @Test
	 public void testGetByCreateTime() {
		List<ShopOrder> orders= orderService.getByCreateTime();
	 }
	
	 @Test
	 public void testGetByUsername() {
		 int amount = orderService.getTotalByUsername("zhang");
	 }
	
	 @Test
	 public void testGetByOrderno() {
	 fail("Not yet implemented");
	 }
	
	 @Test
	 public void testLoadByUsername() {
	 fail("Not yet implemented");
	 }
	
	 @Test
	 public void testLoadByOrderno() {
	 fail("Not yet implemented");
	 }
	
	 @Test
	 public void testGetTotalFilter() {
	 fail("Not yet implemented");
	 }
	
	 @Test
	 public void testLoadFilter() {
	 fail("Not yet implemented");
	 MapperScannerConfigurer map;
	 }

	@Test
	public void testGetGrossSales() {
		Double sales = orderService.getGrossSales();
		Assert.assertTrue(sales+"", sales>=0);
	}
	
	@Test
	public void getCount(){
		int count = orderService.getCount();
	}

	@Test
	public void getNewCount(){
		int count = orderService.getNewCount();
	}
	
	@Test
	public void getHasnotPayCount(){
		int count = orderService.getHasnotPayCount();
	}
	
	@Test
	public void getHasnotDistributionCount(){
		int count = orderService.getHasnotDistributionCount();
	}
	
	@Test
	public void getHasnotAffirmDayThen7(){
		int count = orderService.getHasnotAffirmDayThen7();
	}
	
	@Test
	public void getFinishedOrder(){
		int count = orderService.getFinishedOrder();
	}
	
	@Test
	public void getById(){
		ShopOrder order = orderService.getById(5);
	}
	
}
