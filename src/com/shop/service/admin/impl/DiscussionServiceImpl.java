package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.DiscussionMapper;
import com.shop.model.ShopDiscussion;
import com.shop.service.admin.DiscussionService;
@Service("discussionService")
public class DiscussionServiceImpl implements DiscussionService {
	
	DiscussionMapper discussionMapper;
	@Resource(name="discussionMapper")
	public void setDiscussionMapper(DiscussionMapper discussionMapper) {
		this.discussionMapper = discussionMapper;
	}

	public int getTotalFilterDiscussion(String username, String goodsname,
			String starttime, String endtime) {
		return this.discussionMapper.getTotalFilterDiscussion(username,goodsname,starttime,endtime);
	}

	public List<ShopDiscussion> loadDiscussionInFilter(int page, int rows,
			String username, String goodsname, String starttime, String endtime) {
		int start = (page-1)*rows;
		return this.discussionMapper.loadDiscussionInFilter(start,rows,username,goodsname,starttime,endtime);
	}

	public int getTotalByUsername(String keywords) {
		return this.discussionMapper.getTotalByUsername(keywords);
	}

	public List<ShopDiscussion> loadByUsername(int page, int rows,
			String keywords) {
		int start = (page-1)*rows;
		return this.discussionMapper.loadByUsername(start,rows,keywords);
	}

	public int getTotalByGoodsname(String keywords) {
		return this.discussionMapper.getTotalByGoodsname(keywords);
	}

	public List<ShopDiscussion> loadByGoodsname(int page, int rows,
			String keywords) {
		int start = (page-1)*rows;
		return this.discussionMapper.loadByGoodsname(start,rows,keywords);
	}

}
