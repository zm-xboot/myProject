package 交大慧谷.day09.j01字节流和字符流;

import java.io.File;
import java.io.FileInputStream;

public class Test02 {
    public static void main(String[] args){
        File f = new File("/Users/eleme/Downloads/Hello/2.txt");
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(f);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
