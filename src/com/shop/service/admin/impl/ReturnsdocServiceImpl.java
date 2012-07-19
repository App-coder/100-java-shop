package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.ReturnsdocMapper;
import com.shop.model.ShopRefundmentDoc;
import com.shop.service.admin.ReturnsdocService;
@Service("returnsdocService")
public class ReturnsdocServiceImpl implements ReturnsdocService {
	
	ReturnsdocMapper returnsdocMapper;
	@Resource(name="returnsdocMapper")
	public void setReturnsdocMapper(ReturnsdocMapper returnsdocMapper) {
		this.returnsdocMapper = returnsdocMapper;
	}

	public int getTotal(int if_del) {
		return this.returnsdocMapper.getTotal(if_del);
	}

	@Override
	public List<ShopRefundmentDoc> loadList(int page, int rows, int if_del) {
		int start = (page-1)*rows;
		return this.returnsdocMapper.loadList(start,rows,if_del);
	}

}
