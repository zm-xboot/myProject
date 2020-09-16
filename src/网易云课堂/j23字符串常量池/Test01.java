package 网易云课堂.j23字符串常量池;

//视频地址：https://study.163.com/course/courseLearn.htm?courseId=1209358807#/learn/video?lessonId=1279162207&courseId=1209358807
public class Test01 {
    public static void main(String[] args){
//        int num = 10;
//        num = 11;
//        System.out.println(num);

        String str1 = "hello";
        String str2 = "hello";
//        System.out.println(str1 == str2);
        String str3 = new String("hello");
        String str4 = new String("hello");
        String str5 = new String("hello");

        System.out.println("str1 == str2: "+ (str1 == str2));
        System.out.println("str3 == str4: "+ (str3 == str4));
        System.out.println("str1 == str4: "+ (str1 == str4));

        String str6 = new String("abc") + "abc";
        System.out.println(str6);

        str4 = str4.intern();  //String中的intern()方法，可以让引用直接指向常量池
        System.out.println("str1 == str4: "+ (str1 == str4));

    }
}
