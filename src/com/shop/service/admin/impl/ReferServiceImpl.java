package com.shop.service.admin.impl;

import com.shop.mapper.ReferMapper;
import com.shop.model.ShopRefer;
import com.shop.service.admin.ReferService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("referService")
public class ReferServiceImpl implements ReferService {

	ReferMapper referMapper;

    @Resource(name="referMapper")
	public void setReferMapper(ReferMapper referMapper) {
		this.referMapper = referMapper;
	}

	public int getTotal(String username, String goodsname, String starttime,
			String endtime) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<ShopRefer> loadRefer(int page, int rows, String username,
			String goodsname, String starttime, String endtime) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getCount() {
		return this.referMapper.getCount();
	}


    public int getCountByStatus(int status) {
        return this.referMapper.getCountByStatus(status);
    }
}
