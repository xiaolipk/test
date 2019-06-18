package com.project.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.project.bean.UserBean;

public interface IUserDao {
	@Select("select u_name name,u_pwd pwd from b_user where u_name = #{name}")
	public UserBean findByName(String name);
	@Insert("insert into b_user(u_name,u_pwd) values(#{name},#{pwd})")
	public void addUser(UserBean bean);

}
