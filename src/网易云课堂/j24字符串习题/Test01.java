package 网易云课堂.j24字符串习题;

import java.util.StringTokenizer;

//视频地址：https://study.163.com/course/courseLearn.htm?courseId=1209358807#/learn/video?lessonId=1279159214&courseId=1209358807
public class Test01 {
    // split将字符串拆分成字符串数组,特殊符号不适用：. | \ $ + *,如果要用要加\\转义
    public static void test01(){
        String str = "hello-world";
        // 通过"-"将字符串拆成字符串数组
        String[] split = str.split("-");
        // 计数器打印出来
        for(int i = 0; i<split.length; i++){
            System.out.println(split[i]);
        }
    }

    public static void test02(){
        String str = "hello.world";
        StringTokenizer token = new StringTokenizer(str, ".");
        while(token.hasMoreElements()){
            /**
             * token.hasMoreElements()
             * 1、判断是否有下一个元素
             * 如果有：a.true  b.指向下一个元素
             *
             */
            System.out.println(token.nextElement());
            /**
             * nextElement():取出当前元素
             */
        }
    }
// 如果用split拆分：拆分符正好在末尾，则末尾的字符无法被统计
    public static int test03(String input, String word){
        // 输入一个字符串，统计该字符串中某个单字符出现的次数
        int count = 0;
//        String[] st = input.split("");
//        for(int i = 0; i < st.length; i++){
//            if(st[i].equals(word)){
//                count++;
//            }
//        }
        String[] strs = new String[input.length()];
        for(int i=0;i<strs.length;i++){
            strs[i] = input.substring(i, i+1);   //字符串根据下标位置截取字符
            if(strs[i].equals(word)){
                count++;
            }
        }

        return count;
    }
// input : helloworld  "low" ,判断一个字符串，某个子字符串出现的次数
    public static int test04(String input, String str){
        int count = 0;
        //input.indexOf(str)能找到str则返回str的下标位置，如果找不到则返回-1
        while(input.indexOf(str)!=-1){
            count++;
            input = input.substring(input.indexOf(str) + 1);   //截取已获取目标子字符串下标的
        }
        return count;
    }

    public static void main(String[] args){
//        test01();
//        test02();
//        int count = test03("helloworld", "l");
        int count = test04("llohellowlloorldllo", "llo");
        System.out.println(count);
    }

}
