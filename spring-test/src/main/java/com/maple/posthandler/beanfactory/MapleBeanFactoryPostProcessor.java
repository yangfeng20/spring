package com.maple.posthandler.beanfactory;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @Author: 杨锋
 * @DateTime: 2022/4/5 18:34
 * @Description: 自定义 BeanDefinition 的后置处理器，需要实现 BeanFactoryPostProcessor,同时需要将这个Bean对象注册到容器中
 */

public class MapleBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(@NotNull ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition studentDefinition = beanFactory.getBeanDefinition("student");
		System.out.println("beanDefinition后置处理执行");
		studentDefinition.setAttribute("name", "update");
	}
}
