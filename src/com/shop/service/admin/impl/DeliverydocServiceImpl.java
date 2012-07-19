package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.DeliverydocMapper;
import com.shop.model.ShopRefundmentDoc;
import com.shop.service.admin.DeliverydocService;
@Service("deliverydocService")
public class DeliverydocServiceImpl implements DeliverydocService {
	
	DeliverydocMapper deliverydocMapper;
	@Resource(name="deliverydocMapper")
	public void setDeliverydocMapper(DeliverydocMapper deliverydocMapper) {
		this.deliverydocMapper = deliverydocMapper;
	}

	@Override
	public int getTotal(int if_del) {
		return this.deliverydocMapper.getTotal(if_del);
	}

	@Override
	public List<ShopRefundmentDoc> loadList(int page, int rows, int if_del) {
		int start = (page - 1)*rows;
		return this.deliverydocMapper.loadList(start,rows,if_del);
	}

}
