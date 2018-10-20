package com.github.pengqiangx.demo.dynamic;

/**
 * @author xiaoniu 2018/10/20.
 */

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 切面类注解
 */
@Retention(RUNTIME)
@Target(TYPE)
public @interface Aspect {
    /**
     * 指定要增强的类
     * @return
     */
    Class<?>[] value();
}
