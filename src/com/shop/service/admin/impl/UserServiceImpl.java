package com.shop.service.admin.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.UserMapper;
import com.shop.service.admin.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {

	private UserMapper userMapper;
	@Resource(name="userMapper")
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}



	public int getCount() {
		return this.userMapper.getCount();
	}

}
