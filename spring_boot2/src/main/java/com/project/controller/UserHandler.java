package com.project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bean.UserBean;
import com.project.service.IUserService;

@RestController
public class UserHandler {
	@Autowired
	private IUserService service;
	@GetMapping("/user")
	public List<UserBean> findAll(){
		return service.findAll();
	}
    @GetMapping("/user/{name}")
    public UserBean findByName(@PathVariable("name")String name) {
    	System.out.println(service.findByName(name));
    	return service.findByName(name);
    }
}
