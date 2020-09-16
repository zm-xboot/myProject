package 交大慧谷.day09.j05BufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        // 字节输入流
        InputStream is = System.in;
        // 把字节输入流转换成字符输入流
        InputStreamReader isr = new InputStreamReader(is);
        // 作为一个缓存区放置字符
        BufferedReader br = new BufferedReader(isr);
        // readLine()读取一行
        String s = br.readLine();
        System.out.println(s);
    }
}
