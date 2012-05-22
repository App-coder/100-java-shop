package com.shop.mapper;

import java.util.List;

import com.shop.model.ShopFreightCompany;

public interface FreightCompanyMapper extends BaseMapper<ShopFreightCompany> {

	List<ShopFreightCompany> loadByIsdel(int isdel);
	int updateState(int id, int is_del);
	int deleteById(int id);

}
