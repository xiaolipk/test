package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.bean.BookBean;
import com.project.service.IBookService;

@Controller
public class BookController {
	@Autowired
	private IBookService service;
    @RequestMapping("/show")
    @ResponseBody
	public List<BookBean> show() {
    	List<BookBean> list = service.findAll();
    	return list;
	}
    
    public void UpdateById(int id) {
    	service.updateById(id);
    	
    }
}
