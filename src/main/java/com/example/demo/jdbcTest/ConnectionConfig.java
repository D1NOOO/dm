package com.example.demo.jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author shenf
 * @date 2018/7/25 9:46
 */
public class ConnectionConfig {

    public Connection getCon() {
        //数据库连接名
        String username = "SYSDBA";
        //数据库连接密码
        String password = "123456789";
        String driver = "dm.jdbc.driver.DmDriver";
        String url = "jdbc:dm://localhost:5236";
        Connection conn = null;
        try{
            Class.forName(driver);
            conn=(Connection) DriverManager.getConnection(url,username,password);
        }catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }


}
