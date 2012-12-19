package com.shop.interceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.shop.service.admin.ConfigService;
import com.shop.util.CacheManager;
import com.shop.util.Constant;
import com.shop.util.cache.CacheStore;

public class AdminInterceptor implements HandlerInterceptor {
	
	// preHandle()方法在业务处理器处理请求之前被调用  
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object obj) throws Exception {
		return true;
		/*
		if(request.getSession().getAttribute(Constant.ADMIN_USER)!=null){
			return true;
		}else{
			String servletpath = request.getServletPath();
			if(servletpath.equals("/admin/webmaster/index")||servletpath.equals("/admin/webmaster/login")){
				return true;
			}
			response.sendRedirect("/admin/webmaster/index");
			return false;
		}*/
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
