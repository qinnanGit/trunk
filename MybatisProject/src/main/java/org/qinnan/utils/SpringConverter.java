package org.qinnan.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class SpringConverter implements Converter<String,Date>{
    int a = 10;
	public Date convert(String source) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return sdf.parse(source);
		} catch (Exception e) {
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		return null;
	}
public static void main(String[] args) {
	int[] arr = new int[10];
	System.out.println(arr[6]);
}	
}
