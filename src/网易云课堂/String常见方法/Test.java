package 网易云课堂.String常见方法;

public class Test {
    static String s3;
    public static void main(String[] args){
        //定义字符串方式一：
        String s = "abcd";
        System.out.println(s);
        // 基本类型 int num =10;
        // 对象类型： Person per = new Person();
        // 定义字符串方式二：
        String s1 = new String("helloworld");
        System.out.println(s1);

        //方式三
        String s2 = new String();
        System.out.println(s2.equals(""));     // ""
        System.out.println(s2 == null);   // null

        System.out.println(s3);

        /**
         * 字符串： abcd  中国
         * 通用的理论：
         * 对于非基本类型（对象类型｜引用类型）
         * 1、只定义，不new(实例化): 默认值都是Null
         * Person per;
         * String s3;
         * 2、new实例化：  Xxx xx = new Xxx();
         * xx值：不是null
         * xx内部的属性值目前全部是默认值
         * String s3 = new String(); s3:""
         * Person per = new Person(); per: name是null  age是0
         * 属性(String name,int age)
         *
         */

        //常见的String方法
        String str = "helloworld";
        //判断字符串内容是否严格相等
        boolean flag = str.equals("helloworlD");
        System.out.println(flag);



    }
}
