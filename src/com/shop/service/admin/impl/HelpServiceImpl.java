package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.HelpMapper;
import com.shop.model.ShopHelp;
import com.shop.service.admin.HelpService;

@Service("helpService")
public class HelpServiceImpl implements HelpService {

	HelpMapper helpMapper;
	@Resource(name="helpMapper")
	public void setHelpMapper(HelpMapper helpMapper) {
		this.helpMapper = helpMapper;
	}

	public int getTotal() {
		return this.helpMapper.getTotal();
	}

	public List<ShopHelp> loadModel(int page, int rows) {
		int start = (page-1)*rows;
		return this.helpMapper.loadModel(start,rows);
	}

}
