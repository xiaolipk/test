package com.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.UserBean;
import com.project.dao.IUserDao;
import com.project.service.IUserService;
@Service
public class IUserServiceImpl implements IUserService{
	@Autowired
	private IUserDao dao;   

	@Override
	public UserBean findByName(String name) {
		UserBean bean =dao.findByName(name);
		return bean;
	}

	@Override
	public void register(UserBean bean) {
		dao.addUser(bean);
		
	}

}
