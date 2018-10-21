package com.github.pengqiangx.demo.dynamic;
import java.lang.reflect.Method;
import java.util.Arrays;
/**
 * @author xiaoniu 2018/10/20.
 */

/**
 * 切面
 * 负责类A，类B的日志切面
 * 即为这2个类添加日志功能
 */
@Aspect({ServiceA.class,ServiceB.class})
public class ServiceLogAspect {

    public static void before(Object object, Method method, Object[] args) {
        System.out.println("entering " + method.getDeclaringClass().getSimpleName()
                + "::" + method.getName() + ", args: " + Arrays.toString(args));
    }

    public static void after(Object object, Method method, Object[] args, Object result) {
        System.out.println("leaving " + method.getDeclaringClass().getSimpleName()
                + "::" + method.getName() + ", result: " + result);
    }
}
