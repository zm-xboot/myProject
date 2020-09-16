package 交大慧谷.day11.j04数据库;

import java.sql.*;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String dbdriver = "com.mysql.jdbc.Driver";
        String dburl = "jdbc:mysql://127.0.0.1:3306/python";
        String username = "root";
        String password = "1234";

        /**
         * 链接数据库基本步骤：
         * 1、加载驱动
         * 2、连接数据库（Connection接口和DriverManager类）
         * 3、操作数据库（Statement、PreparedStatement、ResultSet）
         * 4、关闭数据库
          */
        Connection conn = null;
//        Class.forName(dbdriver);
//       conn = DriverManager.getConnection(dburl, username, password);
//        String sql = "select * from python.abc";
//        // 相当于创建一个可执行sql语句的平台
//        Statement stat = conn.createStatement();
//        //通过该平台执行SQL语句，"查询"
//        ResultSet rs = stat.executeQuery(sql);
//        while(rs.next()){
//            // 数据库字段中，索引从1开始
//            System.out.println(rs.getString("name"));//也可以使用索引查询rs.getString(2)
//        }
//        rs.close();
//        stat.close();
//        conn.close();

        Class.forName(dbdriver);
        conn = DriverManager.getConnection(dburl, username, password);
        String sql = "insert/update...";
        // 相当于创建一个可执行sql语句的平台
        Statement stat = conn.createStatement();
        //通过该平台执行SQL语句,"增删改"
        int rs = stat.executeUpdate(sql);
        stat.close();
        conn.close();
    }
}
