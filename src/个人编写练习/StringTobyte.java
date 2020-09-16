package 个人编写练习;

import org.junit.Test;

public class StringTobyte {
//    public static void main(String[] args){
//        String s = "ZhiDao";//定义字符串
//        byte[] sb = s.getBytes();//把字符串转换成数组
//        for(int i=0;i<sb.length;i++){
//            System.out.println(sb[i]);
//        }
//    }
    @Test
    public void sb(){
        String s = "ZhiDao";//定义字符串
        byte[] sb = s.getBytes();//把字符串转换成数组
        for(int i=0;i<sb.length;i++){
            System.out.println(sb[i]);
        }
    }
}
