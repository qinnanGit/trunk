package org.qinnan.user.controller;

import java.util.List;

import org.qinnan.user.entity.User;
import org.qinnan.user.entity.UserTest;
import org.qinnan.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

	
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;
	
	
	@RequestMapping("test.do")
	public ModelAndView test(User user){
		System.out.println("覃楠");
		ModelAndView mav = new ModelAndView();
		mav.addObject("user","覃楠");
		mav.setViewName("user");
		return mav;
	}
	
	@RequestMapping("add.do")
	public ModelAndView add(User user){
		try {
			System.out.println("=================");
			System.out.println(user);
			ModelAndView mav = new ModelAndView();
			mav.addObject("user","覃楠");
			mav.setViewName("user");
			return mav;
		} catch (Exception e) {
			e.printStackTrace();
		}
		    return null;
	}
	
	@RequestMapping("getAllUser.do")
	@ResponseBody
	public  List<User> getAllUser(User user){
		try {
			List<User> userList = userService.getAllUser();
			return userList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@RequestMapping("testUser.do")
	@ResponseBody
	public  ModelAndView testUser(UserTest test){
		try {
			System.out.println(""); 
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		ModelAndView mav = new ModelAndView();
		mav.setViewName("test");
		return mav;
	}
}
