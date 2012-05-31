package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.AdminRoleMapper;
import com.shop.model.ShopAdminRole;
import com.shop.service.admin.AdminRoleService;

@Service("adminRoleService")
public class AdminRoleServiceImpl implements AdminRoleService {

	@Resource(name="adminRoleMapper")
	AdminRoleMapper adminRoleMapper;
	public void setAdminRoleMapper(AdminRoleMapper adminRoleMapper) {
		this.adminRoleMapper = adminRoleMapper;
	}

	public List<ShopAdminRole> loadByIsDel(int i) {
		List<ShopAdminRole> rolelist = this.adminRoleMapper.loadByIsDel(i);
		return rolelist;
	}

}
