package 交大慧谷.day09.j06Scanner;

import java.util.Scanner;

public class Test {
    public static void main(String[] main) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {   // 判断是不是整数,
                int a = scanner.nextInt();
                System.out.println(a);
                break;     //如果符合条件后直接跳出循环
            } else {
                System.out.println("你输入的不是整数，请重新输入：");
            }
        }
    }
}
