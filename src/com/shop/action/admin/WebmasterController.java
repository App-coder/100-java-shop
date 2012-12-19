package com.shop.action.admin;


import com.shop.model.ShopAdmin;
import com.shop.service.admin.*;
import com.shop.util.CacheManager;
import com.shop.util.Constant;
import com.shop.util.StringUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
@RequestMapping(value="admin/webmaster")
public class WebmasterController extends BaseController{

	private AdminService adminService;
	@Resource(name="adminService")
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

    private OrderService orderService;
    @Resource(name="orderService")
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    private UserService userService;
    @Resource(name="userService")
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    private GoodsService goodsService;
    @Resource(name="goodsService")
    public void setGoodsService(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    private ReferService referService;
    @Resource(name="referService")
    public void setReferService(ReferService referService) {
        this.referService = referService;
    }

    private CommentService commentService;
    @Resource(name="commentService")
    public void setCommentService(CommentService commentService) {
        this.commentService = commentService;
    }

    @RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(HttpSession session,ModelMap modelMap) {
		if(session.getAttribute(Constant.ADMIN_USER)!=null){
			return "redirect:/admin/webmaster/console";
		}
		HashMap<String, String> hashconfig = (HashMap<String, String>)CacheManager.getFromCache(Constant.SYSTEM_CONFIG);
		modelMap.addAttribute("webtitle",hashconfig.get("name"));
		return "admin/index";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam("user_name")String user_name,@RequestParam("password")String password,String verify, ModelMap modelMap,HttpSession session){
		String kaptchaExpected = (String)session.getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
		if (kaptchaExpected == null || !kaptchaExpected.equalsIgnoreCase(verify))
		{
			modelMap.addAttribute("message","验证码错误！");
		    return "admin/index";
		}
		ShopAdmin exist = this.adminService.findByName(user_name);
		if(exist!=null){
			if(exist.getPassword().equalsIgnoreCase(StringUtil.getMD5(password.getBytes()))){
				ShopAdmin a = new ShopAdmin();
				a.setId(exist.getId());
				a.setAdminName(exist.getAdminName());
				a.setRoleId(exist.getRoleId());
				a.setLastIp(exist.getLastIp());
				a.setLastTime(exist.getLastTime());
				session.setAttribute(Constant.ADMIN_USER, a);
				return "redirect:/admin/webmaster/console";
			}
			modelMap.addAttribute("message","用户密码错误！");
			return "admin/index";
		}
		modelMap.addAttribute("message","用户名不存在！");
		return "admin/index";
	}
	
	@RequestMapping(value="/loginout", method=RequestMethod.GET)
	public String loginout(HttpSession session){
		session.removeAttribute(Constant.ADMIN_USER);
		return "redirect:/admin/webmaster/index";
	}
	
	@RequestMapping(value="/console")
	public String console(HttpSession session,ModelMap modelMap){
		HashMap<String, String> hashconfig = (HashMap<String, String>)CacheManager.getFromCache(Constant.SYSTEM_CONFIG);
		modelMap.addAttribute("webtitle",hashconfig.get("name"));
		return "admin/console";
	}
	
	@RequestMapping(value="/{item}", method=RequestMethod.GET)
	public String menu(@PathVariable("item") String item,ModelMap modelMap){
		return "admin/menu/"+item;
	}
	
	@RequestMapping(value="/myhomepage")
	public String myhomepage(ModelMap modelMap){

        //销售总额
        Double grossSales = this.orderService.getGrossSales();
        modelMap.addAttribute("grossSales",grossSales);

        //年销售额
        Double yearGrossSales = this.orderService.getYearGrossSales();
        modelMap.addAttribute("yearGrossSales",yearGrossSales);

        //客户数量
        int countOfCustomer = this.userService.getCount();
        modelMap.addAttribute("countOfCustomer",countOfCustomer);

        //产品
        int countOfProduct = this.goodsService.getCount();
        modelMap.addAttribute("countOfProduct",countOfProduct);

        //咨询
        int countOfRefer = this.referService.getCount();
        modelMap.addAttribute("countOfRefer",countOfRefer);

        int countOfNotDealRefer = this.referService.getCountByStatus(0);
        modelMap.addAttribute("countOfNotDealRefer",countOfNotDealRefer);

        //评论
        int countOfCommentAll = this.commentService.getCount(-1);
        modelMap.addAttribute("countOfCommentAll",countOfCommentAll);

        int countOfNotDealComment = this.commentService.getCount(0);
        modelMap.addAttribute("countOfNotDealComment",countOfNotDealComment);

        //总订单
        int orderAll = this.orderService.getCountIsDel(0);
        modelMap.addAttribute("orderAll",orderAll);

        //新订单
        int newOrder = this.orderService.getCountByStatus(1);
        modelMap.addAttribute("newOrder",newOrder);

        int orderNotPay = this.orderService.getCountByPayStatus(0);
        modelMap.addAttribute("orderNotPay",orderNotPay);

        //未发货
        int orderHasDistr = this.orderService.getCountByDistr(0);
        modelMap.addAttribute("orderHasDistr",orderHasDistr);

        int orderHasConfirm = this.orderService.getHasnotAffirmDayThen7();
        modelMap.addAttribute("orderHasConfirm",orderHasConfirm);

        int orderHasFinish = this.orderService.getFinishedOrder();
        modelMap.addAttribute("orderHasFinish",orderHasFinish);

		return "admin/myhomepage";
	}
	
}
