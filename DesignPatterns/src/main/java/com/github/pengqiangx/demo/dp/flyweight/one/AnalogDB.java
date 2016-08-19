package com.github.pengqiangx.demo.dp.flyweight.one;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 存放授权的数据值
 * 模拟DB
 */
public class AnalogDB {

    public static List<String> colDB = new ArrayList<String>();
    static {
        colDB.add("张三,人员列表,查看");

        colDB.add("李四,人员列表,查看");
        colDB.add("李四,薪资数据,查看");

        colDB.add("王五,人员列表,查看");
        colDB.add("王五,薪资数据,查看");
        colDB.add("王五,薪资数据,修改");


    }
}
