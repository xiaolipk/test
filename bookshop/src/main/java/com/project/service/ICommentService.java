package com.project.service;

import java.util.List;

import com.project.bean.CommentBean;

public interface ICommentService {
	public List<CommentBean> findById(int id);
    public void add(CommentBean bean);
}
