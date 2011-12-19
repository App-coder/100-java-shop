package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.EmailregistryMapper;
import com.shop.model.ShopEmailRegistry;
import com.shop.service.admin.EmailregistryService;
@Service("emailregistryService")
public class EmailregistryServiceImpl implements EmailregistryService {

	EmailregistryMapper emailregistryMapper;
	@Resource(name="emailregistryMapper")
	public void setEmailregistryMapper(EmailregistryMapper emailregistryMapper) {
		this.emailregistryMapper = emailregistryMapper;
	}

	@Override
	public int getTotal() {
		return this.emailregistryMapper.getTotal();
	}

	@Override
	public List<ShopEmailRegistry> loadList(int page, int rows) {
		int start = (page-1)*rows;
		return this.emailregistryMapper.loadList(start,rows);
	}

}
