package maple.spring.test.quick;

import maple.spring.test.quick.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @author yangfeng
 * @date : 2023/1/16 21:41
 * desc:
 */


// 不加注解会报错 note 因为如果没有配置类，就会在扫描解析的时候跳过，可以通过在当前类中添加@Bean注解解决
//@ComponentScan
public class AnnotationBootstrap {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationBootstrap.class);
		User user = applicationContext.getBean("user", User.class);
		System.out.println(user);
	}


	@Bean
	public User user(){
		return new User();
	}
}
