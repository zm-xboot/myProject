package 交大慧谷.day09.j04System对IO的支持;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Test04 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/eleme/Downloads/Hello/9.txt");
        FileOutputStream fos = new FileOutputStream(file);
        PrintStream ps = new PrintStream(fos);
        // 重定向控制台的输出
        System.setOut(ps);
        System.out.println("jdfc");
        System.out.println(10);
        System.out.println(false);
        System.out.println(78.890);

    }
}
