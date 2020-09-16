package 交大慧谷.day08.j03比较器;

import java.util.Arrays;

class Student implements Comparable<Student>{
    private String name;
    private int age;
    private int score;

    public Student(String name, int age, int score){
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.age>o.age){
            return 1;
        }else if(this.age<o.age){
            return -1;
        }else if(this.score>o.score){
            return 1;
        }else if(this.score<o.score){
            return -1;
        }
        return this.name.compareTo(o.name);
    }
}


public class Test {
    public static void main(String[] args){
        Student s1 = new Student("jack",20,80);
        Student s2 = new Student("tom",40,88);
        Student s3 = new Student("may",30,78);
        Student[] s ={s1, s2, s3};
        //  通过Arrays.
        Arrays.sort(s);
        for(int i = 0; i<s.length; i++){
            System.out.println(s[i].toString());
        }
    }
}
