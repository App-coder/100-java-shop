package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.PromotionMapper;
import com.shop.model.ShopPromotion;
import com.shop.service.admin.PromotionService;
@Service("promotionService")
public class PromotionServiceImpl implements PromotionService {
	
	PromotionMapper promotionMapper;
	@Resource(name="promotionMapper")
	public void setPromotionMapper(PromotionMapper promotionMapper) {
		this.promotionMapper = promotionMapper;
	}

	public int getTotalByType(int type) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<ShopPromotion> loadByType(int type) {
		// TODO Auto-generated method stub
		return null;
	}

}
