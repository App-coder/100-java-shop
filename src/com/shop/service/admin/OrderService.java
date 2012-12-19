package com.shop.service.admin;

import com.shop.model.ShopOrder;

import java.util.List;

public interface OrderService {
	List<ShopOrder> getByCreateTime();

	/**
	 * @param keywords  用户名
	 * @return
	 */
	int getTotalByUsername(String keywords);

	int getTotalByOrderno(String keywords);

	List<ShopOrder> loadByUsername(int page, int rows, String keywords);

	List<ShopOrder> loadByOrderno(int page, int rows, String keywords);

	int getTotalFilter(int pay_status, int distribution_status, int status);

	List<ShopOrder> loadFilter(int page, int rows, int pay_status,
			int distribution_status, int status);
	
	Double getGrossSales();
	
	Double getYearGrossSales();
	
	/**总订单
	 * @return
	 */
	int getCount();
	
	/**新订单
	 * @return
	 */
	int getNewCount();
	
	/**
	 * 未付款订单
	 * @return
	 */
	int getHasnotPayCount();
	
	/**
	 * 未发货订单
	 * @return
	 */
	int getHasnotDistributionCount();
	
	/**
	 * 七天未确认订单
	 * @return
	 */
	int getHasnotAffirmDayThen7();
	
	
	/**
	 * 
	 * 已经完成的订单
	 * @return
	 */
	int getFinishedOrder();
	
	
	ShopOrder getById(int id);

     /*
     * 得到最新的订单（后台）
     * @return
     */
    List<ShopOrder> getLastNew();

    int getCountIsDel(int i);

    int getCountByStatus(int i);

    int getCountByDistr(int i);

    int getCountByPayStatus(int i);
}
