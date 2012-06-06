package com.shop.interceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.shop.service.admin.ConfigService;
import com.shop.service.portal.GuideService;
import com.shop.util.CacheManager;
import com.shop.util.Constant;
import com.shop.util.cache.CacheStore;

public class PortalInterceptor implements HandlerInterceptor {

	public ConfigService configService;
	@Resource(name="configService")
	public void setConfigService(ConfigService configService) {
		this.configService = configService;
	}
	
	public GuideService guideService;
	@Resource(name="portal_guideService")
	public void setGuideService(GuideService guideService) {
		this.guideService = guideService;
	}
	
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object obj1, Exception e)
			throws Exception {

	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object obj, ModelAndView mod) throws Exception {
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object obj) throws Exception {
		Object systemconfig = CacheManager.getFromCache(Constant.SYSTEM_CONFIG);
		if(systemconfig == null){
			Object hashmap = new CacheStore().getSystemConfig(configService);
			CacheManager.putInCache(Constant.SYSTEM_CONFIG, hashmap);
			request.setAttribute(Constant.SYSTEM_CONFIG, hashmap);
		}else{
			request.setAttribute(Constant.SYSTEM_CONFIG, systemconfig);
		}
		
		//导航的变量
		Object guides = CacheManager.getFromCache(Constant.FRONT_GUIDE);
		if(guides == null){
			guides = this.guideService.loadGuides();
			CacheManager.putInCache(Constant.FRONT_GUIDE, guides);
			request.setAttribute(Constant.FRONT_GUIDE, guides);
		}else{
			request.setAttribute(Constant.FRONT_GUIDE, guides);
		}
		return true;
	}

}
