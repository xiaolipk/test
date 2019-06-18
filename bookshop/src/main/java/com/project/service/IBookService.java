package com.project.service;

import java.util.List;

import com.project.bean.BookBean;

public interface IBookService {
	
	public List<BookBean> findAll();
	
	public void updateById(int id);
	
	public BookBean findById(int id);
    
	public String findImg(int id);
	
}
