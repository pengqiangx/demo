package com.github.pengqiangx.demo.dp.flyweight.one;

/**
 * 测试 权限
 */
public class TestDemo {

    public static void main(String[] args){
        SecurityMgr mgr = SecurityMgr.getInstance();
        mgr.login("张三");
        boolean f1 = mgr.hasPermit("张三","薪资数据","查看");
        System.out.println("张三可以查看薪资数据吗?->"+f1);

        mgr.login("李四");
        boolean f2 = mgr.hasPermit("李四","薪资数据","查看");
        System.out.println("李四可以查看薪资数据吗?->"+f2);

        mgr.login("王五");
        boolean f3 = mgr.hasPermit("王五","薪资数据","修改");
        System.out.println("王五可以修改薪资数据吗?->"+f3);

    }
}
