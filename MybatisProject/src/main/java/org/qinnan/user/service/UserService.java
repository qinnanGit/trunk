package org.qinnan.user.service;

import java.util.List;

import org.qinnan.user.entity.User;



public interface UserService {

	
	public User getUserById(int userId);
	
	public void findAop();
	
	
	public String anotation(User user);
	
	public int insert(User entity);
	
	public int update(User entity);
	
	public List<User> getAllUser();
}
