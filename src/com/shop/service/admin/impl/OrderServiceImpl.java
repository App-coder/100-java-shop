package com.shop.service.admin.impl;

import com.shop.mapper.OrderMapper;
import com.shop.model.ShopOrder;
import com.shop.service.admin.OrderService;
import org.apache.commons.lang.StringEscapeUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("orderService")
public class OrderServiceImpl implements OrderService {

	private OrderMapper orderMapper;
	@Resource(name="orderMapper")
	public void setOrderMapper(OrderMapper orderMapper) {
		this.orderMapper = orderMapper;
	}

	public List<ShopOrder> getByCreateTime() {
		List<ShopOrder> list = this.orderMapper.getByCreateTime(10);
		return list;
	}


	public List<ShopOrder> loadByUsername(int page, int rows, String keywords) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ShopOrder> loadByOrderno(int page, int rows, String keywords) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getTotalFilter(int pay_status, int distribution_status,
			int status) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<ShopOrder> loadFilter(int page, int rows, int pay_status,
			int distribution_status, int status) {
		// TODO Auto-generated method stub
		return null;
	}

	public Double getGrossSales() {
		return this.orderMapper.getGrossSales();
	}

	public Double getYearGrossSales() {
		return this.orderMapper.getYearGrossSales();
	}

	public int getTotalByUsername(String keywords) {
		return this.orderMapper.getTotalByUsername(StringEscapeUtils.escapeJava("%"+keywords+"%"));
	}

	public int getTotalByOrderno(String keywords) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getCount() {
		return this.orderMapper.getCount();
	}

	public int getNewCount() {
		return this.orderMapper.getNewCount();
	}

	public int getHasnotPayCount() {
		return this.orderMapper.getHasnotPayCount();
	}

	public int getHasnotDistributionCount() {
		return this.orderMapper.getHasnotDistributionCount();
	}

	public int getHasnotAffirmDayThen7() {
		return this.orderMapper.getHasnotAffirmDayThen7();
	}

	public int getFinishedOrder() {
		return this.orderMapper.getFinishedOrder();
	}

	public ShopOrder getById(int id) {
		return this.orderMapper.getById(id);
	}

    public List<ShopOrder> getLastNew() {
        return this.orderMapper.getLastNew(10);
    }

    public int getCountIsDel(int i) {
        return this.orderMapper.getCountIsDel(i);
    }

    public int getCountByStatus(int i) {
        return this.orderMapper.getCountByStatus(i);
    }

    public int getCountByDistr(int i) {
        return this.orderMapper.getCountByDistr(i);
    }

    public int getCountByPayStatus(int i) {
        return this.orderMapper.getCountByPayStatus(i);
    }


}
