package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.BookBean;
import com.project.dao.IBookDao;
import com.project.service.IBookService;
@Service
public class IBookServiceImpl implements IBookService{
    @Autowired
	private IBookDao dao;
	@Override
	public List<BookBean> findAll() {
		List<BookBean> list = dao.findAll();
		return list;
	}

	@Override
	public void updateById(int id) {
		dao.updateById(id);
		
	}

	@Override
	public BookBean findById(int id) {
		BookBean bean = dao.findById(id);
		return bean;
	}

	@Override
	public String findImg(int id) {
		String imgName = dao.findImg(id);
		return imgName;
	}



}
