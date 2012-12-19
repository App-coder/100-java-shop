package com.shop.mapper;

import com.shop.model.ShopOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface OrderMapper extends BaseMapper<ShopOrder>{
	List<ShopOrder> getByCreateTime(@Param("size") int size);
    /*
    * 销售总额
    */
	Double getGrossSales();

    /*年销售总额*/
	Double getYearGrossSales();


	int getTotalByUsername(@Param("keywords") String keywords);

	int getCount();

	int getNewCount();

	int getHasnotPayCount();

	int getHasnotDistributionCount();

	int getHasnotAffirmDayThen7();

	int getFinishedOrder();

	ShopOrder getById(@Param("id") int id);

    List<ShopOrder> getLastNew(@Param("size") int size);

    int getCountIsDel(@Param("if_del") int if_del);

    int getCountByStatus(@Param("status") int status);

    int getCountByDistr(@Param("distr") int distr);

    int getCountByPayStatus(@Param("paystatus") int paystatus);
}
