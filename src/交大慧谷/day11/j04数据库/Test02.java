package 交大慧谷.day11.j04数据库;
import java.sql.*;
import java.util.ArrayList;

public class Test02 {
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
        Statement stat = null;
        PreparedStatement ps = null ;
        ResultSet rs = null;

        Class.forName(dbdriver);
        conn = DriverManager.getConnection(dburl, username, password);
        String s = "2' or 1='1";  // 1=1为true，查询出所有的数据信息
        String sql_1 = "select * from python.abc where id ='"+s+"'";
        // 如果只使用Statement接口，容易发生sql注入,不安全
        stat = conn.createStatement();
        rs = stat.executeQuery(sql_1);

        //防注入
        String sql = "select * from python.abc where id = ?";
        ps = conn.prepareStatement(sql);
        ArrayList list = new ArrayList();
        //把每个占位符的内容存入集合中
        list.add(2);
        for(int i =0; i<list.size(); i++){
            //把集合中的每个数据依次填入ps中
            ps.setObject((i+1),list.get(i));
        }
        rs = ps.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString("name"));
        }

        rs.close();
        ps.close();
        conn.close();
        stat.close();
    }
}
