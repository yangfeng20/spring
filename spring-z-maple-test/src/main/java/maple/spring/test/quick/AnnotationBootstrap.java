package maple.spring.test.quick;

import maple.spring.test.quick.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author yangfeng
 * @date : 2023/1/16 21:41
 * desc:
 */


// 不加注解会报错
@ComponentScan
public class AnnotationBootstrap {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationBootstrap.class);
		User user = applicationContext.getBean("user", User.class);
		System.out.println(user);
	}
}
