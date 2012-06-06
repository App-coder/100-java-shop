package com.shop.action.portal;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.shop.bean.common.Pager;
import com.shop.model.ShopArticle;
import com.shop.service.portal.ArticleService;
import com.shop.service.portal.GoodsService;
import com.shop.util.CacheManager;
import com.shop.util.Constant;
import com.shop.util.TimeUtil;

import java.util.*;

@Controller("portal_ArticleController")
@RequestMapping(value="portal/article")
public class ArticleController extends BaseController {
	
	ArticleService articleService;
	@Resource(name="portal_articleService")
	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}
	
	GoodsService goodsService;
	@Resource(name="portal_goodsService")
	public void setGoodsService(GoodsService goodsService) {
		this.goodsService = goodsService;
	}


	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(HttpServletRequest request,ModelMap modelMap ){
		
		int page = 0;
		if(request.getParameter("page")!=null){
			page = Integer.parseInt(request.getParameter("page"));
		}
		int rows = 0;
		if(request.getParameter("rows")!=null){
			rows = Integer.parseInt(request.getParameter("rows"));
		}
		
		HashMap<String, String> hashconfig  = (HashMap<String, String>)CacheManager.getFromCache(Constant.SYSTEM_CONFIG);
		
		if(page==0&&rows==0){
			page = 1;
			rows = 20;
		}else if(rows == 0 ){
			rows = 20;
		}
		
		//商城资讯
		int total = this.articleService.getTotal();
		List<ShopArticle> articles = this.articleService.loadList(page,rows);
		modelMap.addAttribute("pager",new Pager(page, rows, total, articles));
		
		//热卖商品
		Object hotgoods = CacheManager.getKeyCache("hotgoods",TimeUtil.MINUTE_HOUR);
		if(hotgoods == null){
			hotgoods = this.goodsService.loadHotGoods();
			CacheManager.putKeyCache("hotgoods", hotgoods);
		}
		modelMap.addAttribute("hotgoods",hotgoods);
		
		return this.getPage("article/index",hashconfig.get("theme"));
	}
	
	
}