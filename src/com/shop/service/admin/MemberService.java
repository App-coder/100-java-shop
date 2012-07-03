package com.shop.service.admin;

import java.util.List;

import com.shop.model.ShopMember;

public interface MemberService {

	int getTotalByState(int state);

	List<ShopMember> loadModelByState(int page, int rows, int state);


}
