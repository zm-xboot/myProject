package 交大慧谷.day09.j04System对IO的支持;

import java.io.IOException;
import java.io.InputStream;

public class Test02 {
    public static void main(String[] args) throws IOException {
        // 键盘输入类
        InputStream is = System.in;
        // 缺点：有长度限制
        byte[] b = new byte[20];
        System.out.println("请输入内容：" );
        int len = is.read(b);
        String s = new String(b, 0, len);
        System.out.println("你输入的内容是：" + s);
    }
}
