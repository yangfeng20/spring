package com.maple.entity;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author 杨锋
 * @date 2022/11/13 8:33
 * desc:
 */


@Order(10)
@Component
public class A1service {


	@Resource
	private B1service b1service;
}
