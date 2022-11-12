package com.maple.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author 杨锋
 * @date 2022/11/9 21:55
 * desc:
 */

//@DependsOn({"userServiceImpl01"})
@Component
public class UserController {

	static {
		System.out.println("发生类加载：UserController");
	}

	private String name;

	private final Integer age = 20;

	@Qualifier("userServiceImpl01")
	@Autowired
	private UserService userService;
}
