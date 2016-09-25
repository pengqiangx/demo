package com.github.pengqiangx.demo.dp.proxy.two.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 使用java中的动态代理
 */
public class DynamicProxy  implements InvocationHandler{

    //被代理的对象
    private OrderApi order = null;

    /**
     * 获取绑定好代理和具体目标对象后的目标对象的接口
     * @param order 具体的订单对象,相当于具体目标对象
     * @return  绑定好代理和具体目标对象后的目标对象的接口
     */
    public OrderApi getProxyInterface(Order order){
        this.order = order;
        //把真正的订单对象和动态代理关联起来
        OrderApi orderApi = (OrderApi) Proxy.newProxyInstance(
                order.getClass().getClassLoader(),
                order.getClass().getInterfaces(),
                this
        );
        return orderApi;
    }
    /**
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().startsWith("set")){
            if(order.getOrderUser() != null  && order.getOrderUser().equals(args[1])){
                return method.invoke(order,args);
            }else{
                System.out.println("sorry,"+args[1]+",你无权修改本本订单中的数据");
            }
        } else {
            //不是调用setter方法就继续运行
           return method.invoke(order,args);
        }
        return null;
    }
}
