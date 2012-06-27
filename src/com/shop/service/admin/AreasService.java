package com.shop.service.admin;

import java.util.List;

import com.shop.model.ShopAreas;

public interface AreasService {

	List<ShopAreas> getAreaByParent(int parentid);

}
