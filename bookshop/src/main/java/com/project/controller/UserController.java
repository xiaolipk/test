package com.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.bean.UserBean;
import com.project.service.IUserService;

@Controller
public class UserController {
	@Autowired
	private IUserService service;
    @RequestMapping("/login")
	public String findByName(HttpServletRequest req,String name,String pwd) {
    	HttpSession session = req.getSession();
		session.setAttribute("userName", name);
		//产生一个用户（门面对象）
				Subject currentUser = SecurityUtils.getSubject();
				
				 if (!currentUser.isAuthenticated()) {
			            UsernamePasswordToken token = new UsernamePasswordToken(name,pwd);
			            try {
			            	//调用login进行认证
			                currentUser.login(token);
			                System.out.println("认证成功");
			                return "redirect:/html/main.html";
			            } 
			            // 父异常。认证失败异常
			            catch (AuthenticationException ae) {
			                //unexpected condition?  error?
			            	System.out.println("异常不详：自己解决");
			            	return "redirect:/html/login.html";
			            }
			      }
				 return "redirect:/html/main.html";
			}
	@RequestMapping("/reg")
	public String reg(String name,String pwd){
		System.out.println(name);
		Object obj = new SimpleHash("MD5", pwd, name, 1024);
		UserBean user = new UserBean();
		user.setName(name);
		user.setPwd(obj.toString());
		service.register(user);
		
		return "redirect:/html/login.html";
	}
}
