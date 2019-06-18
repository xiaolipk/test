package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.CommentBean;
import com.project.dao.ICommentDao;
import com.project.service.ICommentService;
@Service
public class ICommentServiceImpl implements ICommentService{
    @Autowired
	private ICommentDao dao;
	@Override
	public List<CommentBean> findById(int id) {
		List<CommentBean> list = dao.findById(id);
		return list;
	}
	@Override
	public void add(CommentBean bean) {
		dao.add(bean);
		
	}

}
