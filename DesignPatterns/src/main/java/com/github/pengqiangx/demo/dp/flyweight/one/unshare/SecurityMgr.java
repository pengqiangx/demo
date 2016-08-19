package com.github.pengqiangx.demo.dp.flyweight.one.unshare;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 安全管理  （单例）
 *
 * 充当享元模式中的client的角色
 * 客户端通常会维持一个对Flyweight的引用,计算或存储一个或者多个Flyweight的外部状态
 */
public class SecurityMgr {
    private static SecurityMgr securityMgr = new SecurityMgr();
    public SecurityMgr(){

    }
    public static SecurityMgr getInstance(){
        return securityMgr;
    }
    /**
     * 在运行期间,用来存放登录人员的对应的权限
     * 在web应用中,这些数据通常会存放到session中
     */
    private Map<String,List<Flyweight>> map = new HashMap<String, List<Flyweight>>();

    /**
     * 模拟登录功能
     */
    public void login(String user){
        //登录时就需要把该用户所拥有的权限,从数据库取出来,放到缓存去
        List<Flyweight> col = queryByUser(user);
        map.put(user,col);
    }
    /**
     * 从数据库中获取某人所拥有的权限
     * @param user 需要获取所拥有的权限的人员
     * @return 某人所拥有的权限
     */
    public List<Flyweight> queryByUser(String user){
        List<Flyweight> col = new ArrayList<Flyweight>();
        //AnalogDB.colDB 为模拟数据库表中的数据
        for(String s : AnalogDB.colDB){
            String d[] = s.split(",");
            if(d[0].equals(user)){
                //根据key,从享元工厂获得享元对象
                Flyweight fw = null;
                if(d[3].equals("2")){
                    //2.表示组合
                    fw = new UnsharedConcreateFlyweight();
                    //获取需要组合的数据
                    String com[] = AnalogDB.mapDB.get(d[1]);
                    for(String c : com){
                        Flyweight fc = FlyweightFactory.getInstance().getFlyweight(c);
                        //把这个对象加入到组合对象中去
                        fw.add(fc);
                    }
                }else{
                    fw = FlyweightFactory.getInstance().getFlyweight(d[1]+","+d[2]);
                }
                col.add(fw);
            }
        }
        return col;
    }

    /**
     * 判断某用户对某个安全实体是否拥有某种权限
     * @param user 被检测权限的用户
     * @param securityEntity 安全实体
     * @param permit 权限
     * @return true表示拥有相应的权限  false表示没有对应权限
     */
    public boolean hasPermit(String user,String securityEntity,String permit){
        List<Flyweight> col = map.get(user);
        if(col == null || col.size() == 0){
            System.out.println(user + "没有登录或是没有分配任何权限");
            return false;
        }
        System.out.println("当前用户"+user+"拥有Flyweight(享元)对象实例:"+col.toString());
        for(Flyweight f : col){
            //实体和权限都匹配,返回true
            if(f.match(securityEntity,permit)){
                  return true;
            }
        }
        return false;
    }
}
