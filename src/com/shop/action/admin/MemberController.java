package com.shop.action.admin;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.easyui.ListBean;
import com.shop.model.ShopMember;
import com.shop.service.admin.MemberService;

@Controller
@RequestMapping(value = "admin/member")
public class MemberController extends BaseController {
	
	MemberService memberService;
	@Resource(name="memberService")
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "admin/member";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list(@RequestParam("page") int page,@RequestParam("rows") int rows,@RequestParam("status") int status){
		int total = this.memberService.getTotalByState(status);
		List<ShopMember> models = this.memberService.loadModelByState(page,rows,status);
		ListBean list = new ListBean();
		list.setRows(models);
		list.setTotal(total);
		return objToJson(list);
	}
}
