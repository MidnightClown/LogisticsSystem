package com.dao;

import java.util.List;

import com.entity.LoginUser;
import com.entity.Orders;

public interface LoginUserDao {
	public LoginUser login(LoginUser loginUser);
	public int addUser(LoginUser loginUser);
	public int delUser(LoginUser loginUser);
	public int updateUser(LoginUser loginUser);
	public List<LoginUser> getAllUsers();
	public List<LoginUser> getUsersByName(LoginUser loginUser);
	public List<LoginUser> getDynamicUsers(LoginUser loginUser);
	
	public LoginUser getAllOrders(int id);
}
