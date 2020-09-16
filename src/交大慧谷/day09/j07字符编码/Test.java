package 交大慧谷.day09.j07字符编码;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/eleme/Downloads/Hello/9.txt");
        FileOutputStream fos =  new FileOutputStream(file);
        String ss = "你好！";
        // 把字符串转换成指定编码的字节数组，如果该编码无法兼容字符串中内容，则会变成乱码
        fos.write(ss.getBytes("utf-8"));   //iso8859-1
        fos.close();
    }
}
