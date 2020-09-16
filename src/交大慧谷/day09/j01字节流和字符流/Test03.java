package 交大慧谷.day09.j01字节流和字符流;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) throws IOException {
        String s1 = "hahaha";
        File file = new File("/Users/eleme/Downloads/Hello/3.txt");
        // true是否追加
        FileWriter fw = new FileWriter(file, true);
        fw.write(s1);
        // 这是字节流与字符流的区别
        //字符流需要通过flush刷新缓冲区，才能把内容真正写入文件
        fw.flush();   // 强制刷新操作
        //因为关闭流的时候会强制刷新缓冲区，所以可以不需要主动调用flush方法
//        fw.close();  //内部调用了flush()操作，这是字节流与字符流的区别，字符流必须由此操作才能写入文件中
    }
}
