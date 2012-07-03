package com.shop.model.expand;

import java.util.Date;

import com.shop.model.ShopMember;

public class ShopMemberSearchResult extends ShopMember {
	private String username;
	private Date regtime;
	private String email;
	private String group_name;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getRegtime() {
		return regtime;
	}

	public void setRegtime(Date regtime) {
		this.regtime = regtime;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGroup_name() {
		return group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}

}
