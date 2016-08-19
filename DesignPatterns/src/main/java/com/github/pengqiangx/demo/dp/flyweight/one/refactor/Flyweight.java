package com.github.pengqiangx.demo.dp.flyweight.one.refactor;

/**
 * 享元接口
 * 描述授权数据
 */
public interface Flyweight {
    /**
     * 判断传入的安全实体和权限,是否和享元对象内部状态匹配
     * @param securityEntity 安全实体
     * @param permit 权限
     * @return
     */
    boolean match(String securityEntity,String permit);
}
