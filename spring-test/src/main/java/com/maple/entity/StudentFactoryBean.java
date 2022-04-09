package com.maple.entity;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: 杨锋
 * @DateTime: 2022/4/9 14:45
 * @Description:
 */

public class StudentFactoryBean implements FactoryBean<Student> {

	@Override
	public Student getObject() throws Exception {
		Student student = new Student();
		student.setName("test");
		student.setAge(10);
		return student;
	}

	@Override
	public Class<?> getObjectType() {
		return Student.class;
	}
}
