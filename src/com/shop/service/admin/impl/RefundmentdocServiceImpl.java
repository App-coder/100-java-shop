package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.RefundmentdocMapper;
import com.shop.model.ShopRefundmentDoc;
import com.shop.service.admin.RefundmentdocService;
@Service("refundmentdocService")
public class RefundmentdocServiceImpl implements RefundmentdocService{
	
	RefundmentdocMapper refundmentdocMapper;
	@Resource(name="refundmentdocMapper")
	public void setRefundmentdocMapper(RefundmentdocMapper refundmentdocMapper) {
		this.refundmentdocMapper = refundmentdocMapper;
	}

	@Override
	public int getTotal(int if_del) {
		return this.refundmentdocMapper.getTotal(if_del);
	}

	@Override
	public List<ShopRefundmentDoc> loadList(int page, int rows, int if_del) {
		int start = (page-1)*rows;
		return this.refundmentdocMapper.loadList(start,rows,if_del);
	}

}
