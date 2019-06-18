package com.project.service;

import java.util.List;

import com.project.bean.UserBean;

public interface IUserService {
	public List<UserBean> findAll();
    public UserBean findByName(String name);

}
