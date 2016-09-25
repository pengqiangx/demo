package com.github.pengqiangx.demo.dp.proxy.one.refactor;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by pengqiang on 16/9/22.
 */
public class Proxy implements UserModelApi {

    // 持有被代理的具体的目标对象
    private UserModel realSubject = null;

    public Proxy(UserModel realSubject) {
        this.realSubject = realSubject;
    }

    // 标识是否已经重新装载数据了
    private boolean loaded = false;


    @Override
    public String getUserId() {
        return realSubject.getUserId();
    }

    @Override
    public void setUserId(String userId) {
        realSubject.setUserId(userId);
    }

    @Override
    public String getName() {
        return realSubject.getName();
    }

    @Override
    public void setName(String name) {
        realSubject.setName(name);
    }

    @Override
    public String getDepId() {
        //判断是否已经装载过了
        if(!this.loaded){
            reload();
            this.loaded = true;
        }
        return realSubject.getDepId();
    }

    private void reload(){
        Connection conn = null;
        try{
            conn = this.getConnection();
            String sql = "select * from tbl_user u ,tbl_dep d "
                    + "where u.depId = d.depId and d.depId like ? ";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,realSubject.getUserId());
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()){
                // 只需要重新获取除了userId和name外的数据
                realSubject.setDepId(rs.getString("depId"));
                realSubject.setSex(rs.getString("sex"));
            }
            rs.close();
            pstmt.close();
        }catch (Exception err ){
            err.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private Connection getConnection() throws Exception {
        Class.forName("数据库对应的JDBC驱动类");
        return DriverManager.getConnection("url","user","pwd");
    }


    @Override
    public void setDepId(String depId) {
         realSubject.setDepId(depId);
    }

    @Override
    public String getSex() {
        //判断是否已经装载过了
        if(!this.loaded){
            reload();
            this.loaded = true;
        }
        return realSubject.getSex();
    }

    @Override
    public void setSex(String sex) {
        realSubject.setSex(sex);
    }


}
