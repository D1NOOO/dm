package com.example.demo.jdbcTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author shenf
 * @date 2018/7/25 9:51
 */
public class Test {

    public static List<String> getSelect(){
        //sql
        String sql = " SELECT * FROM person.address";
        //获取连接
        ConnectionConfig conn = new ConnectionConfig();
        Connection connection = conn.getCon();
        PreparedStatement pst = null;

        List<String> list = new ArrayList<>();
        try {
            pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                list.add(rs.getString("ADDRESS1"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {

        List<String> list = getSelect();
        for(String s : list){
            System.out.println(s);
        }
    }
}
