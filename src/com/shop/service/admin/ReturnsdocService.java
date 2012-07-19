package com.shop.service.admin;

import java.util.List;

import com.shop.model.ShopRefundmentDoc;

public interface ReturnsdocService {

	int getTotal(int if_del);

	List<ShopRefundmentDoc> loadList(int page, int rows, int if_del);

}
