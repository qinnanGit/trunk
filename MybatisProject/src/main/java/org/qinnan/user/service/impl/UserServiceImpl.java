package org.qinnan.user.service.impl;

import java.util.HashMap;
import java.util.List;

import org.qinnan.aop.AopAnotation;
import org.qinnan.user.dao.UserDao;
import org.qinnan.user.entity.User;
import org.qinnan.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author nan.qin
 * @date 2017年8月12日
 * @vesion 1.0
 */
@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	private UserDao userDao;
	
	public User getUserById(int userId) {

		return userDao.getUserById(userId);
	}
	@AopAnotation
    public void findAop(){
    	System.out.println("测试aop");
    }
    
    
    @AopAnotation
	public String anotation(User user) {
		System.out.println("测试注解aop");
		findAop();
		return "yyf";
	}
    
    @Transactional(propagation=Propagation.REQUIRED,rollbackFor={Exception.class})
	public int insert(User entity) {
		 return userDao.insert(entity);
	}
	
	public int update(User entity) {
		// TODO Auto-generated method stub
		return userDao.update(entity);
	}
	/**
	 * 
	 */
	public List<User> getAllUser() {
		return userDao.getUserBy(new HashMap<String, Object>());
	}
	
	
}
