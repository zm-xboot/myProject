package 交大慧谷.day09.j01字节流和字符流;

import java.io.*;

public class Tester {
    public static void main(String[] args) throws IOException {
        //  练习：复制图片
        File file1 = new File("/Users/eleme/Downloads/Hello/测试图片-1.png");
        File file2 = new File("/Users/eleme/Downloads/Hello/测试图片-4.png");

//        // 读取file1
        FileInputStream fis1 = new FileInputStream(file1);
//        byte[] b1 = new byte[(int) file1.length()];
//        int len = fis1.read(b1);

        FileOutputStream fos1 = new FileOutputStream(file2);
//        fos1.write(b1);

        int tmp = 0;
        // 只要不等于-1，则代表还能读到内容
        while((tmp = fis1.read()) !=-1){
            // 能读到内容，就把内容直接写出去
            fos1.write(tmp);
        }

        fis1.close();
        fos1.close();
    }
}
