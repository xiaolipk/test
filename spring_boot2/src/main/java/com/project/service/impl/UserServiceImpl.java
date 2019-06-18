package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.UserBean;
import com.project.dao.IUserDao;
import com.project.service.IUserService;
@Service
public class UserServiceImpl implements IUserService{
     @Autowired  
	private IUserDao dao;
	@Override
	public List<UserBean> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public UserBean findByName(String name) {
		// TODO Auto-generated method stub
		return dao.findByName(name);
	}

}
