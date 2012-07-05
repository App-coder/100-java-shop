package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.AnnouncementMapper;
import com.shop.model.ShopAnnouncement;
import com.shop.service.admin.AnnouncementService;
@Service("announcementService")
public class AnnouncementServiceImpl implements AnnouncementService {
	
	AnnouncementMapper announcementMapper;
	@Resource(name="announcementMapper")
	public void setAnnouncementMapper(AnnouncementMapper announcementMapper) {
		this.announcementMapper = announcementMapper;
	}


	public List<ShopAnnouncement> loadAll() {
		return this.announcementMapper.loadAll();
	}

}
