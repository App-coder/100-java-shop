package com.shop.service.admin;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shop.model.ShopUserGroup;

public interface UserGroupService {

	int getTotal();

	List<ShopUserGroup> loadModel(int page, int rows);

}
