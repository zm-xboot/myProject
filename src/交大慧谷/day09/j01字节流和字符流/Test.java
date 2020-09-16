package 交大慧谷.day09.j01字节流和字符流;

import java.io.File;
import java.io.FileOutputStream;

public class Test {
    public static void main(String[] args){
        /**
         * 1、通过File找到一个文件
         * 2、使用不同的流，视角是当前的idea编辑器，往外写入2.txt文件中，所以用FileOutputStream类进行实例化
         */
        //通过字节流向外部文件输出
        String text = "朱梅\r\n";  //  \r\n在外部文件中换行
        File file = new File("/Users/eleme/Downloads/Hello/2.txt");   //默认寻找有的文件，没有的话立即创建该路径文件
        FileOutputStream fos = null;
        try {
            // true是否在原内容上追加
            fos = new FileOutputStream(file, true);
            //一次性直接写
//            fos.write(text.getBytes());   //write只接收字节数组
            // 一个个写出
            byte[] b = text.getBytes();
            for(int i=0; i<b.length;i++){
                fos.write(b[i]);
            }
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
