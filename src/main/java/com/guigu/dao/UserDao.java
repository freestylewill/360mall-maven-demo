package com.guigu.dao;

import com.guigu.entity.User;

import java.util.List;



public interface UserDao {
	int insert(User user);
	int update(User user);
	int delete(User user);
	List<User> getAll();   //查询全部
	User findUser(User user);//用于登陆判断
	List<User> getUserByName(String user);

}
