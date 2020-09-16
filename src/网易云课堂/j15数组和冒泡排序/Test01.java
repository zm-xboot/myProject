package 网易云课堂.j15数组和冒泡排序;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args){
        /**
         * 数组
         * 为什么要用数组
         * 计算全年级300人的总分
         *
         * 数组简化
         * int[] students = new int[300];
         * int students[] = new int[300];
         *
         * 数组的使用：数组名[下标]->数组元素
         *
         * 四要素：数组名 下标 类型 数组元素
         * 数组的类型和数组元素的类型一致（兼容）
         * int num =10;
         * long num =10;  左边大类型  右边小类型
         * 什么时候用数组？当多个元素类型相同，考虑用数组
         *
         * 数组定义：三种形式
         * int[] students = new int[3];
         * int[] students = new int[]{1,2,3};
         * int[] students = {1,2,3}; //不能拆开
         *
         * 数组的长度：数组名.length
         */

        int[] students = new int[3];
        int sum = 0;
        System.out.println("数组的长度："+students.length);
        Scanner input = new Scanner(System.in);
        for(int i=0;i<students.length;i++){
            System.out.println("请输入第"+(i+1)+"个学生的成绩:");  //字符串拼接   数学加
            students[i] = input.nextInt();
            sum += students[i];
        }
        System.out.println("总成绩："+sum);

        for(int i=0;i<3;i++){
            System.out.println("第"+(i+1)+"个学生的成绩为："+students[i]);
        }

//        //1:只声明数组的元素个数，但不赋值（默认值）,可先声明，后赋值
//        int[] students = new int[3];
//        int[] students0;
//        students0 = new int[3];
//        System.out.println(students[0]);

        //2:只赋值，但不声明元素个数，可先声明，后赋值
//        int[] students2 = new int[]{1,2,3};
//        int[] students4;
//        students4 = new int[]{1,2,3};
//        int num;
//        num = 1;
//        System.out.println(students2[1]);

        //3:理解为2的简化形式,此种形式，不能拆开编写,语法问题，不能拆开写
//        int[] student3 = {23,45,78};
//        System.out.println(student3[1]);
    }
}
