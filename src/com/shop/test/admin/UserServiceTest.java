package com.shop.test.admin;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.shop.service.admin.UserService;
import com.shop.test.BeanGenerater;

public class UserServiceTest {

	static UserService userService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		userService = (UserService)BeanGenerater.getBeanByName("userService");
	}

	@Test
	public void testGetCount() {
		userService.getCount();
	}

}
