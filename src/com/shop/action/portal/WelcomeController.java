package com.shop.action.portal;

import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shop.service.portal.AnnouncementService;
import com.shop.service.portal.ArticleService;
import com.shop.service.portal.BrandService;
import com.shop.service.portal.CategoryService;
import com.shop.service.portal.CommentService;
import com.shop.service.portal.GoodsKeywordsService;
import com.shop.service.portal.GoodsService;
import com.shop.service.portal.PromotionService;
import com.shop.service.portal.RegimentService;
import com.shop.util.CacheManager;
import com.shop.util.Constant;
import com.shop.util.JsonUtil;
import com.shop.util.StringUtil;
import com.shop.util.TimeUtil;
import java.util.*;

@Controller
@RequestMapping(value="portal/welcome")
public class WelcomeController extends BaseController{
	
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
	
	CategoryService categoryService;
	@Resource(name="portal_categoryService")
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	GoodsKeywordsService goodsKeywordsService;
	@Resource(name="portal_goodsKeywordsService")
	public void setGoodsKeywordsService(GoodsKeywordsService goodsKeywordsService) {
		this.goodsKeywordsService = goodsKeywordsService;
	}

	RegimentService regimentService;
	@Resource(name="portal_regimentService")
	public void setRegimentService(RegimentService regimentService) {
		this.regimentService = regimentService;
	}

	PromotionService promotionService;
	@Resource(name="portal_promotionService")
	public void setPromotionService(PromotionService promotionService) {
		this.promotionService = promotionService;
	}

	AnnouncementService announcementService;
	@Resource(name="portal_announcementService")
	public void setAnnouncementService(AnnouncementService announcementService) {
		this.announcementService = announcementService;
	}

	
	BrandService brandService;
	@Resource(name="portal_brandService")
	public void setBrandService(BrandService brandService) {
		this.brandService = brandService;
	}

	CommentService commentService;
	@Resource(name="portal_commentService")
	public void setCommentService(CommentService commentService) {
		this.commentService = commentService;
	}




	/**
	 * 网站首页
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(HttpServletRequest request,ModelMap modelMap){
		HashMap<String, String> hashconfig  = (HashMap<String, String>)CacheManager.getFromCache(Constant.SYSTEM_CONFIG);
		
		//资讯
		Object toparticles = CacheManager.getKeyCache("toparticles",TimeUtil.MINUTE_HOUR);
		if(toparticles == null){
			toparticles = this.articleService.load(5);
			CacheManager.putKeyCache("toparticles", toparticles);
		}
		modelMap.addAttribute("toparticles",toparticles);
		
		//首页幻灯片
		String slidestr = hashconfig.get("index_slide");
		Object indexslide = JsonUtil.getObjectArray4Json(slidestr);
		modelMap.addAttribute("indexslide",indexslide);
		
		//热卖商品
		Object hotgoods = CacheManager.getKeyCache("hotgoods",TimeUtil.MINUTE_HOUR);
		if(hotgoods == null){
			hotgoods = this.goodsService.loadHotGoods();
			CacheManager.putKeyCache("hotgoods", hotgoods);
		}
		modelMap.addAttribute("hotgoods",hotgoods);
		
		//全部商品分类
		Object allCategory = CacheManager.getKeyCache("allCategory",TimeUtil.MINUTE_HOUR);
		if(allCategory == null){
			allCategory = this.categoryService.loadAllCategory();
			CacheManager.putKeyCache("allCategory", allCategory);
		}
		modelMap.addAttribute("allCategory",allCategory);
		
		//热门搜索关键字
		Object keywords = CacheManager.getKeyCache("keywords",TimeUtil.MINUTE_HOUR);
		if(keywords == null){
			keywords = this.goodsKeywordsService.loadKeyWords(5);
			CacheManager.putKeyCache("keywords", keywords);
		}
		modelMap.addAttribute("keywords",keywords);
		
		//团购商品
		Object regiment =  CacheManager.getKeyCache("regiment",TimeUtil.MINUTE_HOUR);
		if(regiment == null){
			regiment = this.regimentService.loadRegiments();
			CacheManager.putKeyCache("regiment", regiment);
		}
		modelMap.addAttribute("regiment",regiment);
		
		
		//抢购
		Object scareBuying =  CacheManager.getKeyCache("scareBuying",TimeUtil.MINUTE_HOUR);
		if(scareBuying == null){
			scareBuying = this.promotionService.loadScareBuying();
			CacheManager.putKeyCache("scareBuying", scareBuying);
		}
		modelMap.addAttribute("scareBuying",scareBuying);
		
		//最新商品
		Object newGoods = CacheManager.getKeyCache("newGoods",TimeUtil.MINUTE_HOUR);
		if(newGoods == null){
			newGoods = this.goodsService.loadNewGoods();
			CacheManager.putKeyCache("newGoods", newGoods);
		}
		modelMap.addAttribute("newGoods",newGoods);
		
		//商品类列表
		Object topCategoryGoods = CacheManager.getKeyCache("topCategoryGoods",TimeUtil.MINUTE_HOUR);
		if(topCategoryGoods == null){
			topCategoryGoods = this.goodsService.loadTopCategoryGoods();
			CacheManager.putKeyCache("topCategoryGoods", topCategoryGoods);
		}
		modelMap.addAttribute("topCategoryGoods",topCategoryGoods);
		
		//公告通知  
		Object announcement =  CacheManager.getKeyCache("announcement",TimeUtil.MINUTE_HOUR);
		if(announcement == null){
			announcement = this.announcementService.loadAnnouncement(5);
			CacheManager.putKeyCache("announcement", announcement);
		}
		modelMap.addAttribute("announcement",announcement);
		
		
		//关键字列表
		Object keywordslist = CacheManager.getKeyCache("keywordslist",TimeUtil.MINUTE_HOUR);
		if(keywordslist == null){
			keywordslist = this.goodsKeywordsService.loadKeyWords(20);
			CacheManager.putKeyCache("keywordslist", keywordslist);
		}
		modelMap.addAttribute("keywordslist",keywordslist);
		
		
		//品牌列表
		Object brands = CacheManager.getKeyCache("brands",TimeUtil.MINUTE_HOUR);
		if(brands == null){
			brands = this.brandService.loadBrands(6);
			CacheManager.putKeyCache("brands", brands);
		}
		modelMap.addAttribute("brands",brands);
		
		//最新评论
		Object newComments = CacheManager.getKeyCache("newComments",TimeUtil.MINUTE_HOUR);
		if(newComments == null){
			newComments = this.commentService.loadComment(4);
			CacheManager.putKeyCache("newComments", newComments);
		}
		modelMap.addAttribute("newComments",newComments);
		
		modelMap.addAttribute("webtitle",hashconfig.get("name"));
		
		return this.getPage("index",hashconfig.get("theme"));
	}
	
}
