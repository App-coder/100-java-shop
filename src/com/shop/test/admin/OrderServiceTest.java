package com.shop.test.admin;

import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.shop.service.admin.OrderService;

public class OrderServiceTest{

	static OrderService orderService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("sfsdf");
		// Spring启动所需要的配置参数文件,其中test/JunitTestConf.xml文件中保存了数据库连接等参数,可根据具体情况做修改
		String[] paths = new String[] { "classpath:applicationContext.xml",
				"file:WebContent/WEB-INF/springmvc-servlet.xml"};
		// 启动Spring，得到Spring环境上下文
		ApplicationContext ctx = new ClassPathXmlApplicationContext(paths);
		orderService = (OrderService) ctx.getBean("orderService");
	}

	//
	// @Test
	// public void testSetOrderMapper() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// public void testGetByCreateTime() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// public void testGetByUsername() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// public void testGetByOrderno() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// public void testLoadByUsername() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// public void testLoadByOrderno() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// public void testGetTotalFilter() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// public void testLoadFilter() {
	// fail("Not yet implemented");
	// }

	@Test
	public void testGetGrossSales() {
		Double sales = orderService.getGrossSales();
		System.out.println(sales);
	}

}
