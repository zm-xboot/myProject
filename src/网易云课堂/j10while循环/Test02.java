package 网易云课堂.j10while循环;

public class Test02 {
    public static void main(String[] args){
        /*
        循环：重复执行的事情、
        打印10000遍hello world
        循环操作/循环体、循环条件
        程序中循环 = 循环条件+循环操作
        while(循环条件){
            循环操作;
        }
         */
//        System.out.println("Hello World");
        int i = 0;  //也可以写1，但是程序里面一般写0比较规范
        while(i<10000){
            System.out.println(i+"Hello World");
            i++; //更新变量
        }

        /**
         *  1 while结构与if很像
         *  但是while每次判断执行完毕后，再次进入判断体执行循环，而if就判断一次
         *  2 循环要注意更新变量，防止死循环（无限循环）
         */

        //2010上网人数8000万，假设每年按30%增加，问哪一年人数增长到30000万（3亿）？
        /**
         * 循环的思路：
         * 会：能识别 ====== 循环条件、循环操作->套语法
         * while(循环条件){
         *     循环操作;
         * }
         * 不会：不用循环，多写几步，观察循环条件、循环操作
         */

        // 2010
        int year = 2010;
        int persons = 8000;
//
//        //2011
//        year ++;
//        persons = (int)(persons*(1+0.3));
//
//        //2012
//        year ++;
//        persons = (int)(persons*(1+0.3));
//
//        //2013
//        year ++;
//        persons = (int)(persons*(1+0.3));

        //通过"多写几步"可以发现循环操作：
        while(persons<30000){
            year ++;
            persons = (int)(persons*(1+0.3));
            System.out.println(year+","+persons);
        }
        System.out.println(year);
    }
}
