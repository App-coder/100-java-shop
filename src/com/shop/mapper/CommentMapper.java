package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shop.model.ShopComment;

/**
 * User: zhujun
 * Date: 2011-12-18
 * Time: 下午2:12:05
 */
public interface CommentMapper {
    int getCount(@Param("status") int status);

	List<ShopComment> loadFilter(@Param("start") int start,@Param("rows") int rows,@Param("username") String username,
			@Param("goodsname") String goodsname,@Param("starttime") String starttime,@Param("endtime") String endtime);

	int getTotalFilter(@Param("username") String username,@Param("goodsname") String goodsname,@Param("starttime") String starttime,
			@Param("endtime")	String endtime);
}
