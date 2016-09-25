package com.github.pengqiangx.demo.dp.proxy.one.refactor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by pengqiang on 16/9/22.
 */
public class UserManager {
    /**
     *
     */
    public Collection<UserModelApi> getUserByDepId(String depId ) throws Exception {
        Collection<UserModelApi> col = new ArrayList<UserModelApi>();
        Connection conn = null;
        try{
            conn = getConnection();
            String sql = "select * from tbl_user u ,tbl_dep d "
                    + "where u.depId = d.depId and d.depId like ? ";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,depId+"%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()){
                //这里是创建的代理对象,而不是直接创建UserModel的对象
                Proxy proxy = new Proxy(new UserModel());
                proxy.setUserId(rs.getString("userId"));
                proxy.setName(rs.getString("name"));
                col.add(proxy);
            }
            rs.close();
            pstmt.close();
        }finally {
            conn.close();
        }
        return col;
    }

    private Connection getConnection() throws Exception {
        Class.forName("数据库对应的JDBC驱动类");
        return DriverManager.getConnection("url","user","pwd");
    }

}
