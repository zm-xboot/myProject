package 网易云课堂.j21对象数组习题和猜拳游戏;


/**
 * 题目：有3个学生，每个学生有姓名、2门成绩；
 * 计算每个学生的平均分、总分，
 * 并按总分降序输出（姓名、总分、平均分）
 */

class Student{
    String name;
    int englishScore;
    int javaScore;

    public double getAvg(){
         return getSum()/2.0;
    }

    public int getSum(){
        return englishScore+javaScore;
    }
}


public class Test01 {

    //比较方法  stu1 stu2
    public static void compareStudent(Student[] students){
        //冒泡排序
        for(int i=0;i<students.length-1;i++){     //外层比n-1轮
            for(int j=0;j<students.length-1-i;j++){     //内层比n-1-i轮
                if(students[j].getSum()<students[j+1].getSum()){  //当前元素>下一个元素
                    //交换位置
                    /** 冒泡排序里面比较的是内层排序的变量，比较的是j的前后信息
                     * int temp = num1;
                     * num1 = num2;
                     * num2 = temp;
                     */
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        Student stu1 = new Student();
        stu1.name = "01";
        stu1.englishScore = 87;
        stu1.javaScore = 18;

        Student stu2 = new Student();
        stu2.name = "02";
        stu2.englishScore = 97;
        stu2.javaScore = 68;

        Student stu3 = new Student();
        stu3.name = "03";
        stu3.englishScore = 37;
        stu3.javaScore = 88;

        double stu1Avg = stu1.getAvg();
        double stu2Avg = stu2.getAvg();
        double stu3Avg = stu3.getAvg();

        System.out.println(stu1.name+"\t"+stu1Avg+"\t"+stu1.getSum()+"\n"
                +stu2.name+"\t"+stu2Avg+"\t"+stu2.getSum()+"\n"+
                stu3.name+"\t"+stu3Avg+"\t"+stu3.getSum());
        System.out.println("-------------------------");


        //基本数据类型的数组定义
//        int[] nums = new int[3];    //定义数组总长度
//        int[] nums1 = new int[]{1,2,3};   //给数组赋值初始化
        //对象类型的数组定义
//        String[] names = new String[3];
//        String[] names1 = new String[]{"a","b","c"};
//        类型[] 数组名 = new 类型[]{元素值，元素值，元素值};
        Student[] students = new Student[]{stu1,stu2,stu3};   //对象数组
        compareStudent(students);
        //  foreach,for的增强版
        for(Student student:students){
            System.out.println(student.name+"\t"+student.getAvg()+"\t"+student.getSum());
        }

        System.out.println("-------------------------");

        // for普通版
        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name+"\t"+students[i].getAvg()+"\t"+students[i].getSum());
        }


    }
}
