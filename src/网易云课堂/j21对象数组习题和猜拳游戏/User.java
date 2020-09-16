package 网易云课堂.j21对象数组习题和猜拳游戏;

import java.util.Scanner;

public class User {
    String name;
    int score;

    public int showFist(){
        System.out.println("请出拳：1.剪刀\t2.石头\t3.布");
        Scanner input =  new Scanner(System.in);
        int choice = input.nextInt();
        if(choice == 1){
            System.out.println("您出了剪刀");
        }else if(choice == 2){
            System.out.println("您出了石头");
        }else if(choice == 3){
            System.out.println("您出了布");
        }else{
            System.out.println("输入有误！");
        }
        return choice;
    }
}
