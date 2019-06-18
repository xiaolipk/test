package com.project.service;

import com.project.bean.UserBean;

public interface IUserService {
	public UserBean findByName(String name);
	public void register(UserBean bean);

}
