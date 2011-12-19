package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.NotifyregistryMapper;
import com.shop.model.ShopNotifyRegistry;
import com.shop.service.admin.NotifyregistryService;
@Service("notifyregistryService")
public class NotifyregistryServiceImpl implements NotifyregistryService {

	NotifyregistryMapper notifyregistryMapper;
	@Resource(name="notifyregistryMapper")
	public void setNotifyregistryMapper(NotifyregistryMapper notifyregistryMapper) {
		this.notifyregistryMapper = notifyregistryMapper;
	}

	public int getTotal() {
		return this.notifyregistryMapper.getTotal();
	}

	@Override
	public List<ShopNotifyRegistry> loadList(int page, int rows) {
		int start = (page-1)*rows;
		return this.notifyregistryMapper.loadList(start,rows);
	}

}
