package org.qinnan;

import java.util.List;
import java.util.Map;

public class MyProperties {

	private List<Map<String,Object>> list;

	
	
	public MyProperties() {
		super();
	}

	public List<Map<String, Object>> getList() {
		return list;
	}

	public void setList(List<Map<String, Object>> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "MyProperties [list=" + list + "]";
	}
	
}
