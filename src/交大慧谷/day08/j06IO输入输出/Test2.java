package 交大慧谷.day08.j06IO输入输出;

import java.io.File;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //创建文件夹： mkdir()  mkdirs()
        File file = new File("/Users/eleme/Downloads/Hello/oppo/y/z/q.3.txt");
        //创建多级目录
        file.getParentFile().mkdirs();
        //创建文件时，必须实际存在这样的目录，才能创建文件
        file.createNewFile();
    }
}
