package com.maple.entity;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.BeanNameAware;

/**
 * @Author: 杨锋
 * @DateTime: 2022/4/5 18:39
 * @Description:
 */



public class Student implements BeanNameAware {

	private String name;

	private Integer age;


	private String beanName;

	/**
	 * 实现对应aware接口
	 * spring容器将调用这个方法完成属性赋值
	 */
	@Override
	public void setBeanName(@NotNull String name) {
		System.out.println("aware接口属性赋值");
		this.beanName = name;
	}

	public void show(){
		System.out.println("beanName："+this.beanName);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("set方法执行");
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", age=" + age +
				", beanName='" + beanName + '\'' +
				'}';
	}

	public void init(){
		System.out.println("init方法执行");
	}
}

