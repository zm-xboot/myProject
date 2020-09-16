package 网易云课堂.j12break和continue及示例;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args){
        /**
         * break：退出循环，终止循环
         * continue: 跳过当前循环、继续下一次循环
         */

//        for(int i=0;i<5;i++){
//            if(i==2){
////                break;
//                continue;
//            }
//            System.out.println(i);
//        }

        /**
         * 录入五门课程的成绩，并计算平均分，如果分数为负数,停止录入，并给出错误提示
         * */
//        Scanner input = new Scanner(System.in);
//        int sum =0;
//        boolean flag = true;  //true:5个成绩录入正常；false:失败！
//        for(int i=1;i<=5;i++){
//            System.out.println("请输入第"+i+"门成绩：");
//            int score = input.nextInt();
//            if(score<0){
//                System.out.println("输入有误！停止！");
//                flag = false;
//                break;
//            }
//            sum +=score;
//        }
//        //flag:标记
//        if(flag==true){  //如果场景中分是或不是两种情况，则用flag(true/false)，一切正常则打印，否则不打印
//            System.out.println(sum);
//            System.out.println(sum/5.0);
//        }

        /**
         * 1-20累加，累加到哪个数字时，刚好大于30；
         */
//        int sum=0;
//        for(int i=1;i<=20;i++){
//            sum+=i;
////            sum = sum+i;
//            if(sum>30){
//                System.out.println(i);
//                break;
//            }
//        }
    }
}
