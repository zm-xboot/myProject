package 交大慧谷.day09.j01字节流和字符流;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test04 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/eleme/Downloads/Hello/3.txt");
        FileReader f2 = new FileReader(file);
        char[] c = new char[(int) file.length()];
        int len = f2.read(c);
        System.out.println(new String(c));
        f2.close();
    }
}
