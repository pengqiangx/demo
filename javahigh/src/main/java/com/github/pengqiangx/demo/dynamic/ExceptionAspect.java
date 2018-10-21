package com.github.pengqiangx.demo.dynamic;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author xiaoniu 2018/10/21.
 * 负责类B的异常切面
 */
@Aspect({ ServiceB.class })
public class ExceptionAspect {

    public static void exception(Object object,
                                 Method method, Object[] args, Throwable e) {
        System.err.println("exception when calling: " + method.getName()
                + "," + Arrays.toString(args));
    }
}
