package com.guigu.dao;

import com.guigu.entity.Goods;

import java.util.List;



public interface GoodsDao {
	List<Goods> getGoodById(Goods goods);
	List<Goods> getAll();
	List<Goods> getGoodByName(String goods);
	int delete(Goods goods);
	int update(Goods goods);
	int insert(Goods goods);

}
