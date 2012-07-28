package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.MerchshipinfoMapper;
import com.shop.model.ShopMerchShipInfo;
import com.shop.service.admin.MerchshipinfoService;
@Service("merchshipinfoService")
public class MerchshipinfoServiceImpl implements MerchshipinfoService {
	
	MerchshipinfoMapper merchshipinfoMapper;
	@Resource(name="merchshipinfoMapper")
	public void setMerchshipinfoMapper(MerchshipinfoMapper merchshipinfoMapper) {
		this.merchshipinfoMapper = merchshipinfoMapper;
	}

	@Override
	public int getTotal(int if_del) {
		return this.merchshipinfoMapper.getTotal(if_del);
	}

	@Override
	public List<ShopMerchShipInfo> loadList(int page, int rows, int if_del) {
		int start = (page-1)*rows;
		return this.merchshipinfoMapper.loadList(start,rows,if_del);
	}

}
