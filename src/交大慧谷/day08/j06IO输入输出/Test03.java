package 交大慧谷.day08.j06IO输入输出;

import java.io.*;

public class Test03 {
    public static void main(String[] args){
        FileCopyUtil fc = new FileCopyUtil();
        File src = new File("/Users/eleme/Downloads/Hello/a/c/2.txt");
        File dst = new File("/Users/eleme/Downloads/Hello/b/10.txt");
        try {
            fc.copyFile(src, dst);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

class FileCopyUtil{
    public  void copyFile(File src, File dst) throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dst);
        long time1 = System.currentTimeMillis();     // 获取当前时间毫秒

//        int data = -1;
//        while((data=fis.read())!=-1){
//            fos.write(data);
//            System.out.println(data);
//        }

        byte[] buf = new byte[1024*1024];
        int len =0;
        while((len=fis.read(buf))!=-1){
            fos.write(buf, 0, len);
        }


        fis.close();
        fos.close();
        long time2 = System.currentTimeMillis();
        System.out.println("复制完成共花费："+(time2-time1)+"毫秒");
    }
}
