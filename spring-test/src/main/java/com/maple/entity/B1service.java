package com.maple.entity;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author 杨锋
 * @date 2022/11/13 8:34
 * desc:
 */

@Order(9)
@Component
public class B1service {

	@Resource
	private A1service a1service;
}
