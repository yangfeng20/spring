package com.maple.bootstrap;

import com.maple.annotation.EnableMapleImport;
import com.maple.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 注释模拟线路配置
 *
 * @author 杨锋
 * @date 2022/11/9 9:36
 * desc:
 */

@SuppressWarnings("all")
@Configuration
@EnableMapleImport
@ComponentScan("com.maple")
public class AnnotationBootStrapConfig {


	@Bean
	public Student student(){
		return new Student();
	}


}
