package com.shop.action.admin;

import com.shop.bean.easyui.ListBean;
import com.shop.model.ShopOrder;
import com.shop.service.admin.OrderService;
import com.shop.util.JsonDateValueProcessor;
import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping(value="admin/order")
public class OrderController extends BaseController {
	private OrderService orderService;
	@Resource(name="orderService")
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/order";
	}
	
	@RequestMapping(value="/getByCreateTime", method=RequestMethod.POST)
	@ResponseBody
	public String getByCreateTime(HttpServletResponse response){
		List<ShopOrder> list = this.orderService.getLastNew();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new JsonDateValueProcessor("yyyy-MM-dd HH:mm:ss"));
		
		JSONArray jsonarray = JSONArray.fromObject(list,jsonConfig);
		return jsonarray.toString();
	}
	
	/**
	 * 
	 * 根据类型查询订单
	 * 
	 * @param page
	 * @param rows
	 * @param searchType 查询类型 username,orderno
	 * @param keywords
	 * @return
	 */
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ResponseBody
	public String search(int page,int rows,String searchType,String keywords){
		int total = 0 ;
		List<ShopOrder> orders = new ArrayList<ShopOrder>();
		
		if(searchType.equals("username")){
			total = this.orderService.getTotalByUsername(keywords);
			orders = this.orderService.loadByUsername(page,rows,keywords);
		}else if(searchType.equals("orderno")){
			total = this.orderService.getTotalByOrderno(keywords);
			orders = this.orderService.loadByOrderno(page,rows,keywords);
		}
		
		ListBean bean = new ListBean();
		bean.setRows(orders);
		bean.setTotal(total);
		
		return objToJson(bean);
	}
	
	/**
	 * 筛选订单
	 * 
	 * @param page
	 * @param rows
	 * @param pay_status 支付状态
	 * @param distribution_status 发货状态
	 * @param status 订单状态
	 * @return
	 */
	@RequestMapping(value = "/filter", method = RequestMethod.POST)
	@ResponseBody
	public String filter(int page,int rows,int pay_status,int distribution_status,int status,int if_del){
		int total = this.orderService.getTotalFilter(pay_status,distribution_status,status,if_del);
		List<ShopOrder> orders = this.orderService.loadFilter(page,rows,pay_status,distribution_status,status,if_del);
		
		ListBean list = new ListBean();
		list.setRows(orders);
		list.setTotal(total);
		
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new JsonDateValueProcessor("yyyy-MM-dd"));
		
		return objToJson(list,jsonConfig);
	}

    /**
     * @param id 订单ID
     * @return 订单详细页面
     */
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String info(@RequestParam("id") int id){
        return "admin/order/info";
    }
    
    @RequestMapping(value = "/info_goods", method = RequestMethod.GET)
    @ResponseBody
    public String info_goods(@RequestParam("order_id") int order_id){
    	
    	return "";
    }
    
	
}
