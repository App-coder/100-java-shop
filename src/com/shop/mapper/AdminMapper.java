package com.shop.mapper;

import com.shop.model.ShopAdmin;
import java.util.*;

import org.apache.ibatis.annotations.Param;

public interface AdminMapper extends BaseMapper<ShopAdmin>{
	ShopAdmin findByName(String adminName);
	List<ShopAdmin> loadByIsDel(@Param("is_del") int is_del);
}
