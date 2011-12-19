package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.CollectiondocMapper;
import com.shop.model.ShopCollectionDoc;
import com.shop.service.admin.CollectiondocService;

@Service("collectiondocService")
public class CollectiondocServiceImpl implements CollectiondocService {
	
	CollectiondocMapper collectiondocMapper;
	@Resource(name="collectiondocMapper")
	public void setCollectiondocMapper(CollectiondocMapper collectiondocMapper) {
		this.collectiondocMapper = collectiondocMapper;
	}

	public int getTotal(int if_del) {
		return this.collectiondocMapper.getTotal(if_del);
	}

	@Override
	public List<ShopCollectionDoc> loadList(int page, int rows, int if_del) {
		int start = (page-1)*rows;
		return this.collectiondocMapper.loadList(start,rows,if_del);
	}

}
