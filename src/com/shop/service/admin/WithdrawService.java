package com.shop.service.admin;

import java.util.List;

public interface WithdrawService {

	int getTotal();

	List loadWithdraw(int page, int rows);

}
