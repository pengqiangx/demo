package com.github.pengqiangx.demo.dp.proxy.one.refactor;

/**
 * 定义用户数据对象的接口
 */
public interface UserModelApi {

    public String getUserId();
    public void setUserId(String userId) ;
    public String getName() ;

    public void setName(String name) ;

    public String getDepId() ;
    public void setDepId(String depId) ;
    public String getSex() ;
    public void setSex(String sex) ;
}
