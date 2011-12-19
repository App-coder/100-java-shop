package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shop.model.ShopCollectionDoc;

public interface CollectiondocMapper extends BaseMapper<ShopCollectionDoc>{

	List<ShopCollectionDoc> loadList(@Param("start") int start,@Param("rows") int rows,@Param("if_del") int if_del);

	int getTotal(@Param("if_del") int if_del);

}
