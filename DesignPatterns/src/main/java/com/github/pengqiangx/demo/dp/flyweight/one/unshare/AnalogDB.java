package com.github.pengqiangx.demo.dp.flyweight.one.unshare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 存放授权的数据值
 * 模拟DB
 */
public class AnalogDB {
    //用来单独存放授权数据的值
    public static List<String> colDB = new ArrayList<String>();
    /**
     * 用来存放组合授权数据的值
     * key为组合数据的id,value为该组合包含的多条授权数据的值
     */
    public static Map<String,String[]> mapDB = new HashMap<String, String[]>();
    static {

        //增加一个标识 1:不是组合授权数据  2:是组合授权数据
        colDB.add("张三,人员列表,查看,1");

        colDB.add("李四,人员列表,查看,1");
        colDB.add("李四,薪资数据,查看,1");

        colDB.add("王五,人员列表,查看,1");
        colDB.add("王五,操作薪资数据,,2");

        mapDB.put("操作薪资数据",new String[]{"薪资数据,查看","薪资数据,修改"});
    }
}
