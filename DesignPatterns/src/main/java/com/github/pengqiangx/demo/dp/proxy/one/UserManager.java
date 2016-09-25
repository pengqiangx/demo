package com.github.pengqiangx.demo.dp.proxy.one;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by pengqiang on 16/9/22.
 */
public class UserManager {
    /**
     *
     */
    public Collection<UserModel> getUserByDepId(String depId ) throws Exception {
        Collection<UserModel> col = new ArrayList<UserModel>();
        Connection conn = null;
        try{
            conn = getConnection();
            String sql = "select * from tbl_user u ,tbl_dep d "
                    + "where u.depId = d.depId and d.depId like ? ";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,depId+"%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()){
                UserModel um = new UserModel();
                um.setUserId(rs.getString("userId"));
                um.setName(rs.getString("name"));
                um.setDepId(rs.getString("depId"));
                um.setSex(rs.getString("sex"));
                col.add(um);
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
