package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.OrderMapper;
import com.shop.model.ShopOrder;
import com.shop.service.admin.OrderService;
@Service("orderService")
public class OrderServiceImpl implements OrderService {

	private OrderMapper orderMapper;
	@Resource(name="orderMapper")
	public void setOrderMapper(OrderMapper orderMapper) {
		this.orderMapper = orderMapper;
	}

	public List<ShopOrder> getByCreateTime() {
		List<ShopOrder> list = this.orderMapper.getByCreateTime(10);
		return list;
	}

	public int getByUsername(String keywords) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getByOrderno(String keywords) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<ShopOrder> loadByUsername(int page, int rows, String keywords) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ShopOrder> loadByOrderno(int page, int rows, String keywords) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getTotalFilter(int pay_status, int distribution_status,
			int status) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<ShopOrder> loadFilter(int page, int rows, int pay_status,
			int distribution_status, int status) {
		// TODO Auto-generated method stub
		return null;
	}

}
