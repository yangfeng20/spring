package com.maple.posthandler.beanfactory;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author : 杨锋
 * @date : 2022/4/5 18:34
 * 自定义 BeanDefinition 的后置处理器，需要实现 BeanFactoryPostProcessor,同时需要将这个Bean对象注册到容器中
 * 需要添加入容器才会生效，或者使用ApplicationContext.addBeanFactoryPostProcessor(postProcessor);
 */

public class MapleBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(@NotNull ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition studentDefinition = beanFactory.getBeanDefinition("student");
		System.out.println("beanDefinition后置处理执行");

		// bean实例的字段属性在 beanDefinition 的MutablePropertyValues对象中，只需要添加进这个List即可
		MutablePropertyValues values = studentDefinition.getPropertyValues();
		values.add("name", "update");


	}
}
