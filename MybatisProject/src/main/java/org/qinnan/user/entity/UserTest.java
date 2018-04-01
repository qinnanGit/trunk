package org.qinnan.user.entity;

import java.util.List;

public class UserTest {
	
	private List<User> list;

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "UserTest [list=" + list + "]";
	}
}
