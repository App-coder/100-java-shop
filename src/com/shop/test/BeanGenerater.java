package com.shop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanGenerater {
	public static Object getBeanByName(String beanname){
		String[] paths = new String[] { "classpath:applicationContext.xml",
		"file:WebContent/WEB-INF/springmvc-servlet.xml"};
		// 启动Spring，得到Spring环境上下文
		ApplicationContext ctx = new ClassPathXmlApplicationContext(paths);
		return ctx.getBean(beanname);
	}
}
