package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.FreightCompanyMapper;
import com.shop.model.ShopFreightCompany;
import com.shop.service.admin.FreightCompanyService;

@Service("freightCompanyService")
public class FreightCompanyServiceImpl implements FreightCompanyService {

	FreightCompanyMapper freightCompanyMapper;
	@Resource(name="freightCompanyMapper")
	public void setFreightCompanyMapper(FreightCompanyMapper freightCompanyMapper) {
		this.freightCompanyMapper = freightCompanyMapper;
	}

	public List<ShopFreightCompany> loadByIsdel(int isdel) {
		return this.freightCompanyMapper.loadByIsdel(isdel);
	}

	public int update(ShopFreightCompany freightCompany) {
		return this.freightCompanyMapper.update(freightCompany);
	}

	public int add(ShopFreightCompany freightCompany) {
		return this.freightCompanyMapper.insert(freightCompany);
	}

	public int updateState(int id, int is_del) {
		return this.freightCompanyMapper.updateState(id,is_del);
	}

	public int deleteById(int id) {
		return this.freightCompanyMapper.deleteById(id);
	}

}
