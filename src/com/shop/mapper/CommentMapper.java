package com.shop.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * User: zhujun
 * Date: 12-6-18
 * Time: 下午10:47
 */
public interface CommentMapper {
    int getCount(@Param("status") int status);
}
