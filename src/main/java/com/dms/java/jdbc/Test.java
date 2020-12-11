package com.dms.java.jdbc;

import java.sql.*;

/**
 * @author dongms
 * @version V1.0
 * @Package com.dms.java.jdbc
 * @description 说明：
 * @date 2020/11/23 15:29
 */
public class Test {

    public static void main (String[] args) {
        add();
    }

    public static void add(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@172.16.4.77:1521:urpdb","usr_zsj","wisedu");
            preparedStatement = connection.prepareStatement("insert into test1(wid,username) values (?,?)");

            connection.setAutoCommit(false);
            for (int i=0;i<10000;i++){
                preparedStatement.setString(1,""+i);
                preparedStatement.setString(2,"username"+i);
                preparedStatement.addBatch();
            }

            preparedStatement.executeBatch();
            connection.commit();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void test2(){
        Connection connection = null;
        Statement statement = null;
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@172.16.4.77:1521:urpdb","usr_zsj","wisedu");
            statement = connection.createStatement();
            String sql = "delete from test2";
            int count = statement.executeUpdate(sql);
            System.out.println(count);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }
    }

    public static void test1(){
        Connection con = null;
        Statement stmt = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@172.16.4.77:1521:urpdb", "usr_zsj", "wisedu");
            stmt = con.createStatement();
            String sql = "select * from test2";
            ResultSet result = stmt.executeQuery(sql);

            ResultSetMetaData metaData = result.getMetaData();

            for (int i = 0; i < metaData.getColumnCount(); i++) {
                // resultSet数据下标从1开始
                String columnName = metaData.getColumnName(i + 1);
                System.out.print(columnName + "\t");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
    }
}
