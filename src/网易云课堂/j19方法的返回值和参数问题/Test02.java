package 网易云课堂.j19方法的返回值和参数问题;

import java.util.Scanner;

public class Test02 {
    /**
     * 面向对象编程
     * 从键盘接收，计算三门课的平均成绩、总成绩
     * @param :args
     */
    // 属性（1、静态行为 人：年龄、身高、 2、全局变量）
    int javaScore;
    int cScore;
    int phpScore;
    public void inputScore(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入java成绩");
        javaScore = input.nextInt();

        System.out.println("请输入c成绩");
        cScore = input.nextInt();

        System.out.println("请输入PHP成绩");
        phpScore = input.nextInt();
    }

    //计算平均分并返回
    public double calcAvg(){
        double av = (javaScore+cScore+phpScore)/3.0;
        return av;
    }

    //计算总分并返回
    public int calcSum(){
        int sum  = javaScore+cScore+phpScore;
        return sum;
    }

    public static void main(String[] args){
        Test02 t2 = new Test02();
        t2.inputScore();
        double avg = t2.calcAvg();
        int sum = t2.calcSum();
        System.out.println(avg + "--" + sum);
    }
}
