package 交大慧谷.day08.j05File;

import java.io.File;

public class TestExer {
    public static void main(String[] args){
        //判断文件是否存在
        //如果不存在，则创建出来，反之，则把其删除
        File file = new File("/Users/eleme/Downloads/1.txt");
        if(file.exists()){
            file.delete();
        }else{
            try {
                file.createNewFile();
            }catch(Exception e){
                e.printStackTrace();
            }
        }

        // 列出指定目录下的所有文件路径
        File f = new File("/Users/eleme/Downloads/Hello");

    }

    public static void getListFiles(File file){
        if(file.isDirectory()){
            File[] fs = file.listFiles();
            for(int i=0;i<fs.length;i++){
                getListFiles(fs[i]);
            }
        }else{}

    }
}
