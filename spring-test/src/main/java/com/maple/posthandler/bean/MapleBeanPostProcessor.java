package com.maple.posthandler.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author: 杨锋
 * @DateTime: 2022/4/6 20:09
 * @Description:
 */

@Component
public class MapleBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("student")) {
			System.out.println("bean前置处理器执行");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("student")) {
			System.out.println("bean后置处理器执行");
		}
		return bean;
	}
}
