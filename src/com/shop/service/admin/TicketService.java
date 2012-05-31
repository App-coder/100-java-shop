package com.shop.service.admin;

import java.util.List;

import com.shop.model.ShopTicket;

public interface TicketService {

	int getTotal();

	List<ShopTicket> loadList(int page, int rows);

}
