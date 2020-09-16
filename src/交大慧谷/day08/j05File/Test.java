package 交大慧谷.day08.j05File;

import java.io.File;

public class Test {
    public static void main(String[] args){
        // 创建File对象
        File file = new File("/Users/eleme/Downloads/1.txt");
//        file.separator;  //自适应不同系统的分隔符
        // 在本地创建文件
        try {
            file.createNewFile();
        }catch(Exception e) {
            e.printStackTrace();
        }
        // 删除文件
        file.delete();

        // 判断文件是否存在
        System.out.println(file.exists());

        File file2 = new File("/Users/eleme/Downloads/测试图片-1.png");
        // 判断是否是文件
        System.out.println(file2.isFile());
        //判断是否是文件夹
        System.out.println(file2.isDirectory());

        // 列出目录中的内容：list()   listFiles()
        File f = new File("/Users/eleme/Downloads/Hello");
        String[] ff = f.list();
        for(int i =0;i<ff.length;i++){
            System.out.println(ff[i]);
        }

        File[] fs = f.listFiles();
        for(int i =0;i<fs.length;i++){
            System.out.println(fs[i]);
            //获取父目录的路径
            System.out.println(fs[i].getParent());
            //获取完整路径
            System.out.println(fs[i].getPath());
        }
        // 这两个方法都只能列出指定目录下的第一层
    }
}
