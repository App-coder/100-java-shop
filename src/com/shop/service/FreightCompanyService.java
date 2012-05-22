package com.shop.service;

import java.util.List;

import com.shop.model.ShopFreightCompany;

public interface FreightCompanyService {

	List<ShopFreightCompany> loadByIsdel(int isdel);

	int update(ShopFreightCompany freightCompany);

	int add(ShopFreightCompany freightCompany);

	int updateState(int id, int is_del);

	int deleteById(int id);

}
