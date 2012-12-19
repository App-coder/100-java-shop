package com.shop.mapper;

import org.apache.ibatis.annotations.Param;

public interface ReferMapper {

	int getCount();

    int getCountByStatus(@Param("status") int status);
}
