package 网易云课堂.j22String常见方法;

public class Test01 {
    static String s3;
    public static void main(String[] args){
        // 定义字符串方式一：
        String s = "abcd";
        System.out.println(s);
        //基本类型  int num = 10;
        //对象类型： Person per = new Person();

        //定义字符串方式二：
        String s1 = new String("helloworld");
        System.out.println(s1);

        //方式三：
        String s2 = new String();
        System.out.println(s2); // ""
        System.out.println(s2==null); // null

        System.out.println(s3);
        /**
         * 通用的理论：
         * 对于非基本类型（对象类型｜引用类型），
         * 1、只定义，不new(实例化)：默认值都是Null
         * Person per;
         * String s3;
         * 2、new实例化：
         * Xxx xx = new Xxx();
         * xx值：不是null
         * xx内部的属性值目前全部是数据类型的默认值
         * String s3 = new String(); s3:""
         * Person per = new Person();
         * (String name, int age)
         * per : name是null  age是0
         */

        //常见的String方法
        String str = "   hello  world   ";
        //严格判断是否相等
        boolean flag = str.equals("helloworlD");
        System.out.println(flag);
        //忽略大小写比较
        boolean flag2 = str.equalsIgnoreCase("helloworlD");
        System.out.println(flag2);
        //字符串长度
        int len = str.length();
        System.out.println(len);

        //转成大写
        str = str.toUpperCase();
        System.out.println(str);

        //转成小写
        str = str.toLowerCase();
        System.out.println(str);

        //x寻找下标位置
        //判断字符串A是否存在于另一个字符串B中，如果存在，则返回位置；如果不存在，则返回-1；
        int position = str.indexOf("owo");
        //顺着找
        int position_1 = str.indexOf('o');   //char -> int
        //反着找
        int position_2 = str.lastIndexOf('o');
        System.out.println(position);
        System.out.println(position_1);
        System.out.println(position_2);

        //str
        System.out.println(str);
        System.out.println("实际长度："+str.length());
        str = str.trim();  //去首尾两端的空格，不会去中间的
        System.out.println("去掉首尾空格之后的长度："+str.length());


    }
}
