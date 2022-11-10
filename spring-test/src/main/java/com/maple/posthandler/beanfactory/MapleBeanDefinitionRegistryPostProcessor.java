package com.maple.posthandler.beanfactory;

import com.maple.entity.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

/**
 * @author 杨锋
 * @date 2022/11/10 8:21
 * desc: 用于beanDefinition对象的注册和beanDefinition对象的后置处理
 * 需要添加入容器才会生效，或者使用ApplicationContext.addBeanFactoryPostProcessor(postProcessor);
 */

@Component
public class MapleBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

	}

	@Override
	public void postProcessBeanDefinitionRegistry(@NonNull BeanDefinitionRegistry registry) throws BeansException {
		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
		beanDefinition.setBeanClass(Person.class);
		registry.registerBeanDefinition("person01", beanDefinition);
	}
}
