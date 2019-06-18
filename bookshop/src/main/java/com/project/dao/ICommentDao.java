package com.project.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.project.bean.CommentBean;

public interface ICommentDao {
	@Select("select c_name name,c_time time,c_message message from b_comment where c_b_id =#{id}")
	public List<CommentBean> findById(int id);
	@Insert("insert into b_comment(c_name,c_message,c_time,c_b_id)VALUES(#{name},#{message},#{time},#{c_b_id})")
	public void add(CommentBean bean);
	

}
