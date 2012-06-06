package com.shop.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


public class BaseInterceptor implements HandlerInterceptor {

	// preHandle()方法在业务处理器处理请求之前被调用  
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object obj) throws Exception {
		return true;
	}
	// afterCompletion()方法在DispatcherServlet完全处理完请求后被调用  
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object obj1, Exception e)
			throws Exception {

		
	}
	// postHandle()方法在业务处理器处理请求之后被调用  
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object obj, ModelAndView mod) throws Exception {

	}



}
