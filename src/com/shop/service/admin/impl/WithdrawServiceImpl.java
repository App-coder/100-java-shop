package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.WithdrawMapper;
import com.shop.service.admin.WithdrawService;
@Service("withdrawService")
public class WithdrawServiceImpl implements WithdrawService {

	WithdrawMapper withdrawMapper;
	@Resource(name="withdrawMapper")
	public void setWithdrawMapper(WithdrawMapper withdrawMapper) {
		this.withdrawMapper = withdrawMapper;
	}

	@Override
	public int getTotal() {
		return this.withdrawMapper.getTotal();
	}

	@Override
	public List loadWithdraw(int page, int rows) {
		int start = (page-1)*rows;
		return this.withdrawMapper.loadWithdraw(start,rows);
	}

}
