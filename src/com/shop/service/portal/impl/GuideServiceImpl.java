package com.shop.service.portal.impl;

import com.shop.mapper.GuideMapper;
import com.shop.model.ShopGuide;
import com.shop.service.portal.GuideService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("portal_guideService")
public class GuideServiceImpl implements GuideService {


    private GuideMapper guideMapper;
    @Resource(name="guideMapper")
    public void setGuideMapper(GuideMapper guideMapper) {
        this.guideMapper = guideMapper;
    }


	public List<ShopGuide> loadGuides() {
		return this.guideMapper.loadGuides();
	}

}
