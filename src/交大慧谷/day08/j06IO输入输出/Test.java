package 交大慧谷.day08.j06IO输入输出;

import java.io.File;
import java.io.FileOutputStream;

public class Test {
    public static void main(String[] args) {
        /**
         * 1 、创建
         */
        String name = "aijhdjshd";
        File file = new File("iotest/1.txt");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            fos.write(name.getBytes());
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                fos.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}
