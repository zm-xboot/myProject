package 交大慧谷.day09.j06Scanner;

// 要求输入两个整数，完成两个数字的相加操作，如果输入的不是整数，则要提醒用户继续输入，直到输入正确为止
public class Tester {
    public static void main(String[] args){
        TestSum sum = new TestSum();
        System.out.println("和为："+sum.sum(1)+sum.sum(2));
    }
}


