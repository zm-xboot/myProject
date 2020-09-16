package 交大慧谷.day11.j01属性操作;

import java.io.*;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
//        p.setProperty("SH", "Shanghai");
//        p.setProperty("BJ", "Beijing");
//        p.getProperty("SH");
//        System.out.println(p.getProperty("SH"));
//        //如果未获取到，则返回null
//        System.out.println(p.getProperty("ABC"));
//        //如果未获取到，则返回第二个参数
//        System.out.println(p.getProperty("ABC", "hello"));

//        File file = new File("/Users/eleme/Downloads/Hello/1.properties");
        //保存到外部properties文件
        //文件从当前IDEA写出去，文件输出流
//        FileOutputStream fos = new FileOutputStream(file);
//        //文件备份存储方法
//        p.store(fos, "city");
//        fos.close();

        //从properties文件中读取数据
//        FileInputStream fis = new FileInputStream(file);
//        p.load(fis);
//        System.out.println(p.getProperty("SH"));
//        fis.close();

        //保存成xml文件
        File file = new File("/Users/eleme/Downloads/Hello/1.xml");
//        FileOutputStream fos = new FileOutputStream(file);
//        p.storeToXML(fos, "city");
//        fos.close();

        //从xml文件中读取数据
        FileInputStream fip = new FileInputStream(file);
        p.loadFromXML(fip);
        System.out.println(p.getProperty("SH"));
    }
}
