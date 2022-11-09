package com.maple.application;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 杨锋
 * @DateTime: 2022/4/10 14:02
 * @Description:
 */

public class MapleClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public MapleClassPathXmlApplicationContext(String ...configLocations){
		super(configLocations);
	}

	@Override
	protected void initPropertySources() {
		System.out.println("initProperty执行");
	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		// beanDefinition不能重名（父类默认是允许的）
		this.setAllowBeanDefinitionOverriding(false);

		// 不允许自动解决循环依赖
		this.setAllowCircularReferences(false);

		// 最后执行父类的方法。设置进beanFactory中
		super.customizeBeanFactory(beanFactory);
	}
}
