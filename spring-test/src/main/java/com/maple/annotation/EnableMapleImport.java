package com.maple.annotation;

import com.maple.entity.User;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 杨锋
 * @date 2022/11/13 10:36
 * desc:
 */

@Import(User.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface EnableMapleImport {
}
