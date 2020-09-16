package 网易云课堂.j20传参问题和习题;

import java.util.Scanner;

public class Test02 {
    //数组作为参数，传参
    //5个学生，算平均分和最高分，不能定义全局变量

    //输入成绩
    public void myInput(int[] students){
        // students {0,0,0}
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个学生成绩");
        students[0] = input.nextInt();  //99
        System.out.println("请输入第二个学生成绩");
        students[1] = input.nextInt();  //88
        System.out.println("请输入第三个学生成绩");
        students[2] = input.nextInt();  //77
//        students = new int[]{student1, student2, student3};
    }

    //算平均分
    public double calcAvg(int[] students){
        double avg = calcsum(students)*1.0/students.length;
        return avg;
    }

    //总分
    public int calcsum(int[] students){
        int sum = 0;
        for(int student:students){
            sum += student;
        }
        return sum;
    }

    //最高分
    public int calcMax(int[] students){
        int max = students[0];
        for(int i=1;i<students.length;i++){
            if(max<students[i]){
                max = students[i];
            }
        }
        return max;
    }


    public static void main(String[] args){
        int[] students = new int[3];  //{0,0,0}
        Test02 test = new Test02();
        test.myInput(students);
        double avg = test.calcAvg(students);
        int sum = test.calcsum(students);
        int max = test.calcMax(students);
        System.out.println(avg+","+sum+","+max);

    }


}
