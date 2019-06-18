package com.project.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.bean.BookBean;
import com.project.bean.CommentBean;
import com.project.service.IBookService;
import com.project.service.ICommentService;

@Controller
public class CommentController {
	@Autowired
	private ICommentService service;
	@Autowired
	private IBookService service1;
	@RequestMapping("/ping/{id}")
    public String findById(@PathVariable("id")int id,HttpServletRequest req,ModelMap map) {
		HttpSession session = req.getSession();
		session.setAttribute("id", id);
		List<CommentBean> list= service.findById(id);
		System.out.println("list"+list);
		BookBean bean1 = service1.findById(id);
		String imgName = service1.findImg(id);
		map.put("img", "../img/"+imgName);
		map.put("list", list);
		map.put("book", bean1);
		return "/html/forum.html";
    	 
     }
	@RequestMapping("/add")
	@ResponseBody
	public int add(HttpServletRequest req,String value) {
		HttpSession session = req.getSession();
		String name = (String)session.getAttribute("userName");
		int id = (int) session.getAttribute("id");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = df.format(new Date());
		CommentBean bean =new CommentBean();
		bean.setMessage(value);
		bean.setName(name);
		bean.setTime(time);
		bean.setC_b_id(id);
		System.out.println("bean"+bean);
		service.add(bean);
		service1.updateById(id);
		return id;
		
	}
}
