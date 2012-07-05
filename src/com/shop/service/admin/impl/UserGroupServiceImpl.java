package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.UserGroupMapper;
import com.shop.model.ShopUserGroup;
import com.shop.service.admin.UserGroupService;

@Service("userGroupService")
public class UserGroupServiceImpl implements UserGroupService {
	
	UserGroupMapper userGroupMapper;
	@Resource(name="userGroupMapper")
	public void setUserGroupMapper(UserGroupMapper userGroupMapper) {
		this.userGroupMapper = userGroupMapper;
	}

	public int getTotal() {
		return this.userGroupMapper.getTotal();
	}

	@Override
	public List<ShopUserGroup> loadModel(int page, int rows) {
		int start = (page-1)*rows;
		return this.userGroupMapper.loadModel(start,rows);
	}

}
