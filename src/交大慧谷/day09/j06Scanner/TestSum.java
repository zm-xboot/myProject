package 交大慧谷.day09.j06Scanner;

import java.util.Scanner;

public class TestSum {
    public int sum(int i){
        int x =0;
        while (true) {
            // 每次重新输入都需要一个新的Scanner对象
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入第"+i+"个数字：");
            if (scanner.hasNextInt()) {   // 判断是不是整数,
                x = scanner.nextInt();
                System.out.println(x);
                break;     //如果符合条件后直接跳出循环
            } else {
                System.out.println("你输入的不是整数，请重新输入：");
            }
        }
        return x;
    }
}
