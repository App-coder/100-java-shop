package com.shop.action.admin;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.ListBean;
import com.shop.bean.Message;
import com.shop.model.ShopModel;
import com.shop.service.admin.ModelService;
import java.util.*;

@Controller
@RequestMapping(value = "admin/model")
public class ModelController extends BaseController {
	
	ModelService modelService; 
	@Resource(name="modelService")
	public void setModelService(ModelService modelService) {
		this.modelService = modelService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/model";
	}
	
	/**
	 * 商品模型列表
	 * 
	 * @param page 页数
	 * @param rows 行数
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list(int page,int rows){
		int total = this.modelService.getTotal();
		List<ShopModel> models = this.modelService.loadModel(page,rows);
		ListBean list = new ListBean();
		list.setRows(models);
		list.setTotal(total);
		return objToJson(list);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	@ResponseBody
	public String delete(int ids){
		int affectrows = this.modelService.deleteById(ids);
		
		Message msg = new Message();
		if(affectrows>=1){
			msg.setMessage("商品模型删除成功！");
			msg.setType("true");
		}else{
			msg.setMessage("商品模型删除时发生异常！");
			msg.setType("false");
		}
		return objToJson(msg);
	}
	
	
}
