package 交大慧谷.day09.j04System对IO的支持;

import java.io.IOException;
import java.io.InputStream;

public class Test03 {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        int tmp = 0;
        StringBuffer sb =  new StringBuffer();  // 读取到的内容，一个一个追加数据写入
        System.out.println("输入内容：");
        while((tmp=is.read())!=-1){
            // 把读到的数据转换成字符
            char c = (char) tmp;
            if(c=='\n'){
                break;
            }
            // 把有效字符添加到StringBuffer中
            sb.append(c);
        }
        System.out.println("输出内容："+sb);
    }
}
