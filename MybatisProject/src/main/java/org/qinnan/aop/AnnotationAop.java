package org.qinnan.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnnotationAop {

	
	
	@Pointcut("@annotation(org.qinnan.aop.AopAnotation)")
	public void aspectMethod(){}
	
	
	
	@Before("aspectMethod()")
	public void beforeAdvice(JoinPoint joinPoint){
		System.out.println("注解 一切开始的地方");
		System.out.println("methodName : "+joinPoint.getSignature().getName()); 
	}
	
	@After("aspectMethod()")
	public void afterAdvice(JoinPoint joinPoint){
		System.out.println("注解 一切结束的地方");
	}
	
	@Around("aspectMethod()")
	public void aroundAdvice(ProceedingJoinPoint joinPoint){
		
		try {
			Object object = joinPoint.proceed();
			if(object != null){
				System.out.println("结果是"+object.toString());  
			}
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
