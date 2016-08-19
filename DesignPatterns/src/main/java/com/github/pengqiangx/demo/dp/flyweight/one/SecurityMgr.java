package com.github.pengqiangx.demo.dp.flyweight.one;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 客户端调用
 * 安全管理,实现成单例
 */
public class SecurityMgr {
    private static SecurityMgr securityMgr = new SecurityMgr();
    public SecurityMgr(){

    }
    public static  SecurityMgr getInstance(){
        return securityMgr;
    }
    /**
     * 在运行期间,用来存放登录人员的对应的权限
     * 在web应用中,这些数据通常会存放到session中
     */
    private Map<String,List<AuthorizationModel>> map = new HashMap<String, List<AuthorizationModel>>();

    /**
     * 模拟登录功能
     */
    public void login(String user){
        //登录时就需要把该用户所拥有的权限,从数据库取出来,放到缓存去
        List<AuthorizationModel> col = queryByUser(user);
        map.put(user,col);
    }
    /**
     * 从数据库中获取某人所拥有的权限
     * @param user 需要获取所拥有的权限的人员
     * @return 某人所拥有的权限
     */
    public List<AuthorizationModel> queryByUser(String user){
        List<AuthorizationModel> col = new ArrayList<AuthorizationModel>();
        for(String s : AnalogDB.colDB){
            String d[] = s.split(",");
            if(d[0].equals(user)){
                AuthorizationModel am = new AuthorizationModel();
                am.setUser(d[0]);
                am.setSecurityEntity(d[1]);
                am.setPermit(d[2]);
                col.add(am);
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
        List<AuthorizationModel> col = map.get(user);
        if(col == null || col.size() == 0){
            System.out.println(user + "没有登录或是没有分配任何权限");
            return false;
        }
        System.out.println("当前用户"+user+"拥有AuthorizationModel对象实例"+col.toString());
        for(AuthorizationModel am : col){
            //实体和权限都匹配,返回true
            if(am.getSecurityEntity().equals(securityEntity)
                    && am.getPermit().equals(permit)){
                return true;
            }
        }
        return false;
    }
}
