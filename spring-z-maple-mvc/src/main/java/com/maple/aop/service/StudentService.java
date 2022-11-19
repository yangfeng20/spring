package com.maple.aop.service;

import org.springframework.stereotype.Component;

/**
 * @author 杨锋
 * @date 2022/11/19 16:19
 * desc:
 */


@Component
public class StudentService implements Service{

	public void addStudent(){
		System.out.println("StudentService.addStudent");
	}

	public void deleteStudent(){
		System.out.println("StudentService.deleteStudent");
	}
}
