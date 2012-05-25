package com.shop.mapper;

import java.util.List;

import com.shop.model.ShopAdminRole;

public interface AdminRoleMapper {

	List<ShopAdminRole> loadByIsDel(int is_del);

}
