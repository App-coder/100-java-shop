package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.MemberMapper;
import com.shop.model.ShopMember;
import com.shop.service.admin.MemberService;
@Service("memberService")
public class MemberServiceImpl implements MemberService {

	MemberMapper memberMapper;
	@Resource(name="memberMapper")
	public void setMemberMapper(MemberMapper memberMapper) {
		this.memberMapper = memberMapper;
	}
	
	public int getTotalByState(int status) {
		return this.memberMapper.getTotalByState(status);
	}
	@Override
	public List<ShopMember> loadModelByState(int page, int rows, int status) {
		int start = (page-1)*rows;
		return this.memberMapper.loadModelByState(start,rows,status);
	}


}
