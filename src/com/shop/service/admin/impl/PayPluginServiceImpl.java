package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.action.admin.PayPluginService;
import com.shop.mapper.PayPluginMapper;
import com.shop.model.ShopPayPlugin;

@Service("payPluginService")
public class PayPluginServiceImpl implements PayPluginService {

	PayPluginMapper payPluginMapper;
	@Resource(name="payPluginMapper")
	public void setPayPluginMapper(PayPluginMapper payPluginMapper) {
		this.payPluginMapper = payPluginMapper;
	}

	@Override
	public List<ShopPayPlugin> loadPayPluginsByVisibility(int i) {
		return this.payPluginMapper.loadPayPluginsByVisibility(i);
	}

	@Override
	public List<ShopPayPlugin> loadPayment() {
		return this.payPluginMapper.loadPayment();
	}

}
