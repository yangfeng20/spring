package com.maple.test.entity;

import org.springframework.stereotype.Component;

/**
 * @author 杨锋
 * @date 2023/1/8 22:24
 * desc:
 */

@Component
public class Person01 {

	static {
		System.out.println("Person01.static 初始值设定项");
	}
}
