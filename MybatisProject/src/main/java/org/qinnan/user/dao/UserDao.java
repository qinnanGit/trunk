package org.qinnan.user.dao;

import java.util.List;
import java.util.Map;

import org.qinnan.user.entity.User;

public interface UserDao {

	
	public User getUserById(int userId);
	
	public int insert(User entity);
	
	public int update(User entity);
	
	public List<User> getUserBy(Map<String,Object> map );
}
