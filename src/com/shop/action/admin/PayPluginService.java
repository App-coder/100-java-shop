package com.shop.action.admin;

import java.util.List;

import com.shop.model.ShopPayPlugin;

public interface PayPluginService {

	List<ShopPayPlugin> loadPayPluginsByVisibility(int i);

	List<ShopPayPlugin> loadPayment();

}
