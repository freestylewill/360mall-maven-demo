package com.guigu.dao;


import com.guigu.entity.Cart;

import java.util.List;

public interface CartDao {
	int insert(Cart cart);
	int delete(Cart cart);
	int update(Cart cart);
	List<Cart> getAll(Cart cart);
	List<Cart> getCartByGid(Cart cart);
	

}
