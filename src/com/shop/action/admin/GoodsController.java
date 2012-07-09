package com.shop.action.admin;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.common.Message;
import com.shop.bean.easyui.ListBean;
import com.shop.model.ShopGoods;
import com.shop.service.admin.GoodsService;

@Controller
@RequestMapping(value = "admin/goods")
public class GoodsController extends BaseController {

	GoodsService goodsService;

	@Resource(name = "goodsService")
	public void setGoodsService(GoodsService goodsService) {
		this.goodsService = goodsService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "admin/goods";
	}

	/**
	 * 筛选
	 * 
	 * @param page
	 *            页
	 * @param rows
	 *            行数
	 * @param categoryid
	 *            分类ID
	 * @param isdel
	 *            上下架
	 * @param storenums
	 *            库存数量
	 * @param commend
	 *            商品标签
	 * @return
	 */
	@RequestMapping(value = "/filter", method = RequestMethod.POST)
	@ResponseBody
	public String filter(@RequestParam("page") int page,
			@RequestParam("rows") int rows,
			@RequestParam("categoryid") int[] categoryids,
			@RequestParam("isdel") int isdel,
			@RequestParam("storenums") int storenums,
			@RequestParam("commend") int commend) {

		int total = this.goodsService.getTotalFilterGoods(categoryids, isdel,
				storenums, commend);
		List<ShopGoods> goods = this.goodsService.loadGoodsFilterGoods(page,rows,
				categoryids, isdel, storenums, commend);

		ListBean list = new ListBean();
		list.setRows(goods);
		list.setTotal(total);

		return objToJson(list);
	}

	/**
	 * 快速查询
	 * 
	 * @param page
	 *            页面
	 * @param rows
	 *            记录数
	 * @param search
	 *            查询方式
	 * @param keywords
	 *            关键字
	 * @return
	 */
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ResponseBody
	public String search(int page, int rows, String search, String keywords) {
		int total = 0;
		List<ShopGoods> goods = new ArrayList<ShopGoods>();
		if (search == "goods_name") {
			// 根据名称查询
			total = this.goodsService.getTotalByName(search);
			goods = this.goodsService.loadGoodsByName(page, rows, keywords);

		} else if (search == "catalog_name") {
			// 根据类别查询
			total = this.goodsService.getTotalByCatelog(search);
			goods = this.goodsService.loadCatelog(page, rows, keywords);

		}

		ListBean list = new ListBean();
		list.setRows(goods);
		list.setTotal(total);

		return objToJson(list);
	}

	/**
	 * 删除操作，物理删除
	 * 
	 * 根据商品的id列表删除商品
	 * 
	 * @param ids
	 *            商品id列表
	 * @return
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public String deleteByIds(int[] ids) {
		int affectrows = this.goodsService.deleteByIds(ids);
		Message msg = new Message();
		if (affectrows >= 1) {
			msg.setMessage("商品删除成功！");
			msg.setType("true");
		} else {
			msg.setMessage("删除时发生异常！");
			msg.setType("false");
		}
		return objToJson(msg);
	}

	/**
	 * 商品上架下架设置
	 * 
	 * @param ids
	 *            商品的id列表
	 * @param isdel
	 *            0,1
	 * @return
	 */
	public String updateIsDel(int[] ids, int isdel) {
		int affectrows = this.goodsService.updateIsDel(ids, isdel);
		Message msg = new Message();
		if (affectrows >= 1) {
			msg.setMessage("商品编辑成功！");
			msg.setType("true");
		} else {
			msg.setMessage("编辑时发生异常！");
			msg.setType("false");
		}
		return objToJson(msg);
	}

}
