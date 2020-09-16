package 个人编写练习.KF;


import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UUIDGenerator {
    private static final Logger logger = LoggerFactory.getLogger(UUIDGenerator.class);

    // UUID含义是通用唯一识别码
    public static String getUUID(){
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString(); //转换成字符串
        logger.error("打点");
        //去掉"-"符号
        String temp = str.substring(0,8)+str.substring(9,13)+ str.substring(14, 18) + str.substring(19, 23) + str.substring(24);
        //字符串截取:
        /**
         * 1、public String substring(int beginIndex),
         * 这个方法截取的字符串是从索引beginIndex开始的，到整个字符串的末尾，例如：字符串String s = "abcdef";
         * 调用s.substring(2)表示从字符串的索引2开始截取到整个字符串结束，截取的字符串为cdef
         */

        /**
         * 2、public String  substring(int beginIndex, int endIndex),
         * 这个方法截取的字符串从beginIndex开始，到字符串索引的endIndex - 1结束，
         * 即截取的字符串不包括endIndex这个索引对应的字符，所以endIndex的最大值为整个字符串的长度，
         * 所以使用这个方法的时候需要特别注意容易发生字符串截取越界的问题
         */
        return str+","+temp;
    }
    //获得指定数量的UUID
    public static String[] getUUID(int number){
        if(number<1){
            return null;
        }
        String[] ss = new String[number];
        for(int i=0;i<number;i++){
            ss[i] = getUUID();
        }
        return ss;
    }

    public static void main(String[] args){
       String[] ss = getUUID(10);
       for(int i = 0;i<ss.length;i++){
           System.out.println(ss[i]);
       }
    }
}
