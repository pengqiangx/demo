package com.github.pengqiangx.demo.dp.proxy.one;

/**
 * Created by pengqiang on 16/9/22.
 */
public class UserModel {

    private String userId;

    private String name;

    //部门编号
    private String depId;

    private String sex;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
