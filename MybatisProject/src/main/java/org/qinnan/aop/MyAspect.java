package org.qinnan.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.qinnan.user.entity.User;

@Aspect
public class MyAspect {

	
	@Pointcut("execution(* find*(..))")
	private void aspectMethod(){}
	
	
	@Before("aspectMethod()")
	public void beforeAdvice(JoinPoint joinPoint){
		Object[] object = joinPoint.getArgs();
		for (int i = 0; i < object.length; i++) {
			if(object[i] instanceof User){
				System.out.println((User)object[i]);
			}
			if(object[i] instanceof String){
			   System.out.println("字符串哦"+object[i].toString());	
			}
		}
		System.out.println("最初开始的地方");
	}
	@After("aspectMethod()")
	public void afterAdvice(JoinPoint joinPoint){
		System.out.println("最终结束的地方");
	}
}
