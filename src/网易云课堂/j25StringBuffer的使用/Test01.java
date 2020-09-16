package 网易云课堂.j25StringBuffer的使用;


/**
 * 视频地址：https://study.163.com/course/courseLearn.htm?courseId=1209358807#/learn/video?lessonId=1279157230&courseId=1209358807
 */
public class Test01 {
    public static void main(String[] args){
        // indexof("子字符串")： 子字符串在源字符串中的位置下标
        // 子字符串>位置,寻找子字符串，如果子字符串存在，则返回位置，否则返回-1
        String str = "zhumeihello";
        int position = str.indexOf("mei");
        int position_1 = str.indexOf("x");
        System.out.println(position);
        System.out.println(position_1);

        //位置>字符
        char c = str.charAt(7);
        System.out.println(c);

        //replace
        System.out.println(str);
//        str = str.replace('e','y');
//        System.out.println(str);

        String str_1 = str.replace(  "zhumei", "ali");
        System.out.println(str_1);
    }
}
