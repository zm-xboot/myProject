package 网易云课堂.j10while循环;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args){
        /**
         * while(循环条件){
         *     循环操作；
         * }
         * while:先判断  后执行
         * do{
         *  循环操作；
         * }while(循环条件);
         * do...while:先执行  后判断,至少执行一次
         *
         */

//         while(1>2){
//             System.out.println("abc");
//         }

//        do{
//            System.out.println("abc");
//        }while(1>2);

        int money = 0;
        Scanner input = new Scanner(System.in);
        String isContinue = "";
        do{
            System.out.println("请选择：\n1.体血衫（100） 2.夹克（200）3.衬衫（300）");
            int choice = input.nextInt();
            if(choice==1){
                System.out.println("体血衫\t"+100);
                money = money + 100;
            }else if(choice==2){
                System.out.println("夹克\t"+200);
                money = money + 200;
            }else if(choice==3){
                System.out.println("衬衫\t"+300);
                money = money + 300;
            }else{
                System.out.println("输入有误！");
            }
            System.out.println("是否继续？y/n");
            isContinue = input.next(); // y/n
        }while(isContinue.equals("y"));   //变量的作用域  最近一对
        System.out.println("总共花了:"+money);

    }
}
