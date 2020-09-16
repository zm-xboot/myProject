package 交大慧谷.day09.j03打印流;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        // 创建文件对象
        File file = new File("/Users/eleme/Downloads/Hello/5.txt");
        //创建输出流
        FileOutputStream fos = new FileOutputStream(file);
        //选择输出流的输出方式
        PrintStream ps = new PrintStream(fos);
        ps.println("hello");
        ps.println(10);
        ps.println(10.7);

        String name = "zhumei";
        int age = 30;
        double salary = 10000;
        // 格式化输出
        ps.printf("姓名：%s, 年龄：%d, 工资：%5.2f", name, age, salary);

        ps.close();
    }
}
