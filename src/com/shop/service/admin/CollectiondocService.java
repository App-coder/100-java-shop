package com.shop.service.admin;

import java.util.List;

import com.shop.model.ShopCollectionDoc;

public interface CollectiondocService {

	int getTotal(int if_del);

	List<ShopCollectionDoc> loadList(int page, int rows, int if_del);

}
