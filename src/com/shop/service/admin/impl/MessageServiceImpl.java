package com.shop.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.mapper.MessageMapper;
import com.shop.model.ShopMessage;
import com.shop.service.admin.MessageService;
@Service("messageService")
public class MessageServiceImpl implements MessageService {

	MessageMapper messageMapper;
	@Resource(name="messageMapper")
	public void setMessageMapper(MessageMapper messageMapper) {
		this.messageMapper = messageMapper;
	}

	@Override
	public int getTotal() {
		return this.messageMapper.getTotal();
	}

	@Override
	public List<ShopMessage> loadList(int page, int rows) {
		int start = (page-1)*rows;
		return this.messageMapper.loadList(start,rows);
	}

}
