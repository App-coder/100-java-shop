package com.shop.service.admin;

import java.util.List;
import com.shop.model.ShopSpec;

public interface SpecService {

	int getTotal(int isdel);

	List<ShopSpec> loadModel(int page,int rows,int isdel);

}
