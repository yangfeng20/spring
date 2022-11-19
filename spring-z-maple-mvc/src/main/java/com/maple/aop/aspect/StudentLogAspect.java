package com.maple.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author 杨锋
 * @date 2022/11/19 16:20
 * desc:
 */

@Component
@Aspect
public class StudentLogAspect {


	@Before("execution(public void com.maple.aop.service.*.*(..))")
	public void printLog(JoinPoint joinPoint) {
		System.out.println("StudentLogAspect.printLog");
	}
}
