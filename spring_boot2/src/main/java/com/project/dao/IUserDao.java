package com.project.dao;

import java.util.List;

import com.project.bean.UserBean;

public interface IUserDao {
	
	public List<UserBean> findAll();
    public UserBean findByName(String name);
    
}
