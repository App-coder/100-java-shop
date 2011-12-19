package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.MsgTemplateMapper;
import com.shop.model.ShopMsgTemplate;
import com.shop.service.admin.MsgTemplateService;

@Service("msgTemplateService")
public class MsgTemplateServiceImpl implements MsgTemplateService {

	MsgTemplateMapper msgTemplateMapper;
	@Resource(name="msgTemplateMapper")
	public void setMsgTemplateMapper(MsgTemplateMapper msgTemplateMapper) {
		this.msgTemplateMapper = msgTemplateMapper;
	}


	public List<ShopMsgTemplate> loadAll() {
		return this.msgTemplateMapper.loadAll();
	}

}
