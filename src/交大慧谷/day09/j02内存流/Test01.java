package 交大慧谷.day09.j02内存流;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class Test01 {
    public static void main(String[] args){
        String s1 = "hello world";
        ByteArrayInputStream bis = new ByteArrayInputStream(s1.getBytes());    // 字节数组内存流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int tmp = 0;
        while((tmp=bis.read())!=-1){
            bos.write(tmp);
        }
        System.out.println(bos);
    }
}
