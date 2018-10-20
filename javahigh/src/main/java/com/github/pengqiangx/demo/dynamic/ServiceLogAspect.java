package com.github.pengqiangx.demo.dynamic;

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

}
