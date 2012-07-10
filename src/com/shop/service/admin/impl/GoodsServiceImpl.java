package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.GoodsMapper;
import com.shop.model.ShopGoods;
import com.shop.service.admin.GoodsService;
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
	
	GoodsMapper goodsMapper;
	@Resource(name="goodsMapper")
	public void setGoodsMapper(GoodsMapper goodsMapper) {
		this.goodsMapper = goodsMapper;
	}

	public int getTotalByName(String search) {
		return this.goodsMapper.getTotalByName(search);
	}

	public List<ShopGoods> loadGoodsByName(int page, int rows, String keywords) {
		return this.goodsMapper.loadGoodsByName(page,rows,keywords);
	}

	public List<ShopGoods> loadCatelog(int page, int rows, String keywords) {
		return this.goodsMapper.loadCatelog(page,rows,keywords);
	}

	public int getTotalByCatelog(String search) {
		return this.goodsMapper.getTotalByCatelog(search);
	}

	public int getTotalFilterGoods(String[] categoryids, int isdel, int storenums,
			int commend) {
		String categorystr = null;
		if(categoryids.length>=1&&!categoryids[0].equals("0")){
			for(int i=0;i<categoryids.length;i++){
				if(i!=categoryids.length-1){
					categorystr +=" FIND_IN_SET('"+categoryids[i]+"', brand.category_ids))!= 0 or";
				}else{
					categorystr +=" FIND_IN_SET('"+categoryids[i]+"', brand.category_ids))!= 0";
				}
			}
		}
		return this.goodsMapper.getTotalFilterGoods(categorystr,isdel,storenums,commend);
	}

	public List<ShopGoods> loadGoodsFilterGoods(int page, int rows,String[] categoryids, int isdel,
			int storenums, int commend) {
		int start = (page-1)*rows;
		String categorystr = null;
		if(categoryids.length>=1&&!categoryids[0].equals("0")){
			for(int i=0;i<categoryids.length;i++){
				if(i!=categoryids.length-1){
					categorystr +=" FIND_IN_SET('"+categoryids[i]+"', brand.category_ids))!= 0 or";
				}else{
					categorystr +=" FIND_IN_SET('"+categoryids[i]+"', brand.category_ids))!= 0";
				}
			}
		}
		return this.goodsMapper.loadGoodsFilterGoods(start,rows,categorystr,isdel,storenums,commend);
	}

	public int deleteByIds(int[] ids) {
		return 0;
	}

	public int updateIsDel(int[] ids, int isdel) {
		return 0;
	}

	public int getCount() {
		return this.goodsMapper.getCount();
	}


}
