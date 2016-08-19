package com.github.pengqiangx.demo.dp.flyweight.one.unshare;


/**
 * 封装授权数据中重复出现部分的 享元对象
 */
public class AuthorizationFlyweight implements Flyweight {

    //内部状态,安全实体
    private String securityEntity;

    //内部状态,权限
    private String permit;

    /**
     * 构造方法
     * @param state 状态数据（包含安全实体和权限的数据,用","分隔）
     */
    public AuthorizationFlyweight(String state){
        String data[] = state.split(",");
        this.securityEntity = data[0];
        this.permit = data[1];
    }
    public boolean match(String securityEntity, String permit) {
        if(this.securityEntity.equals(securityEntity)
                && this.permit.equals(permit)){
            return true;
        }
        return false;
    }

    public void add(Flyweight f) {
        /**
         * 本方法主要是针对组合对象的,因此在叶子对象中抛出不支持的例外就可以了
         */
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    /**
     * 注意:根据需要,可以提供外部的访问内部的数据的getter方法,但是不会提供setter方法
     * 即:这些数据不会让外部来修改
     *
     */
    public String getSecurityEntity() {
        return securityEntity;
    }

    public String getPermit() {
        return permit;
    }
}
