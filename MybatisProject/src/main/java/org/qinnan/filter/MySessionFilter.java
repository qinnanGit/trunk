package org.qinnan.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;

public class MySessionFilter implements Filter{

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest)arg0;
		HttpServletResponse response = (HttpServletResponse)arg1;
		System.out.println("进入个人拦截器");
		if(request.getSession(false)==null){
			if(request.getRequestedSessionId()==null){
				System.out.println("我是第一次访问哦,session是新的!");
				Cookie cookie = new Cookie("id", "qinnan");
				cookie.setMaxAge(1000);
				response.addCookie(cookie);
			}
			else{
				System.out.println(request.getRequestedSessionId());
				System.out.println("您的session已经过期,请重新登陆吧!");
			}
		}
		else{
			System.out.println("服务器"+request.getSession().getId());
			System.out.println("客户端"+request.getRequestedSessionId());
		}

		Cookie[] cookies = request.getCookies();
		if(cookies!=null){
		for (int i = 0; i < cookies.length; i++) {
			System.out.println("key : "+cookies[i].getName()+" value : "+cookies[i].getValue());
		   }
		}
		Cookie cookia = new Cookie("id",null);
		cookia.setMaxAge(0);
		response.addCookie(cookia);

		chain.doFilter(arg0, arg1);
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
}
