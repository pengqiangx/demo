package com.github.pengqiangx.demo.javacore.db;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by pengqiang on 2017/8/16.
 */
public class ConnectionDb {

    @Test
    public void getStaff() throws Exception{
        Collection<Map> col = new ArrayList<Map>();
        Connection conn = null;
        try {
            conn = this.getConnection();
            String sql = "select t.staff_id as staffId, t.staff_name as staffName, t.email as eMail from TF_M_STAFF t";
            PreparedStatement pstmt = conn.prepareStatement(sql);


            ResultSet rs = pstmt.executeQuery();
            while (rs.next()){
                Map sm  = new HashMap();
                sm.put("staffId",rs.getString("staffId"));
                sm.put("staffName",rs.getString("staffName"));
                sm.put("eMail",rs.getString("eMail"));

                col.add(sm);
            }
            rs.close();
            pstmt.close();

        }finally {
            conn.close();
        }
    }

    private Connection getConnection() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        return DriverManager.getConnection("jdbc:oracle:thin:@10.142.195.62:1521:xx","ecs_store","xx#xTW");

    }
}
