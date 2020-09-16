package 网易云课堂.j10while循环;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args){
        System.out.println("请输入月份：");
        Scanner input = new Scanner(System.in);
        if(input.hasNextInt()){ // 判断是否是数字
            int month = input.nextInt();
            switch(month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("是大月。。。");
                    break;
            }
        }else{
            System.out.println("请重新输入。。。");
        }
    }
}
