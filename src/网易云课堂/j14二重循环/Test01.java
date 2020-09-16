package 网易云课堂.j14二重循环;

import java.util.Scanner;

public class Test01 {
    /**
     * 二重循环：外层循环执行一次，内层循环执行一轮（从头到尾）
     * 打印图形、算法（冒泡排序）：外层循环和内层循环之间的数学关系
     * @param args
     */

    public static void main(String[] args) {
        for (int j=0;j<3;j++) {
            System.out.println("j:"+j+"外------------");

//            System.out.println("第"+(j+1)+"个班级");
//            //一个班级有4个同学，求班级的平均分
//            Scanner input = new Scanner(System.in);
//            int sum = 0;
//            int score = 0;
            for (int i = 0; i < 4; i++) {
                System.out.println("i:"+i+"内------------");
//                System.out.println("请输入第" + (i + 1) + "个学生的成绩");
//                score = input.nextInt();
//                sum += score;
            }
//            System.out.println("这个班的平均分为：" + sum / 4.0);
        }
    }
}
