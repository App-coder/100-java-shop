package com.shop.service.admin;

import java.util.List;

import com.shop.model.ShopAdminRole;

public interface AdminRoleService {

	List<ShopAdminRole> loadByIsDel(int i);

}
