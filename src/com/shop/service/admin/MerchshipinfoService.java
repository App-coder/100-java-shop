package com.shop.service.admin;

import java.util.List;

import com.shop.model.ShopMerchShipInfo;

public interface MerchshipinfoService {

	int getTotal(int if_del);

	List<ShopMerchShipInfo> loadList(int page, int rows, int if_del);

}
