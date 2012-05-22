package com.shop.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.DeliveryMapper;
import com.shop.model.ShopDelivery;
import com.shop.service.DeliveryService;

@Service("deliveryService")
public class DeliveryServiceImpl implements DeliveryService {

	DeliveryMapper deliveryMapper;
	@Resource(name="deliveryMapper")
	public void setDeliveryMapper(DeliveryMapper deliveryMapper) {
		this.deliveryMapper = deliveryMapper;
	}

	public List<ShopDelivery> loadAll() {
		return this.deliveryMapper.loadAll();
	}

	public int add(ShopDelivery delivery) {
		return this.deliveryMapper.insert(delivery);
	}

	public int update(ShopDelivery delivery) {
		return this.deliveryMapper.update(delivery);
	}

	public int deleteById(int id) {
		return this.deliveryMapper.deleteById(id);
	}

}
