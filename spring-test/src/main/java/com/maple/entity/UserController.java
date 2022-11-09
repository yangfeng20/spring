package com.maple.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author 杨锋
 * @date 2022/11/9 21:55
 * desc:
 */

@Component
public class UserController {

	@Qualifier("userServiceImpl01")
	@Autowired
	private UserService userService;
}
