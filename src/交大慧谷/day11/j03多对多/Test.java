package 交大慧谷.day11.j03多对多;

import java.util.Iterator;

public class Test {
    public static void main(String[] args){
        Student s1 = new Student("zhumei", 30);
        Student s2 = new Student("ameng", 40);
        Student s3 = new Student("ali", 20);

        Course c1 = new Course("java");
        Course c2 = new Course("python");
        Course c3 = new Course("php");

        s1.getCourses().add(c3);
        s2.getCourses().add(c1);
        s2.getCourses().add(c3);
        s3.getCourses().add(c2);

        c1.getStudents().add(s1);
        c1.getStudents().add(s2);
        c2.getStudents().add(s1);
        c2.getStudents().add(s3);
        c3.getStudents().add(s1);
        c3.getStudents().add(s2);

        //通过学生找到他所报名的课程
        Iterator<Course> cs = s2.getCourses().iterator();   //集合的输出用迭代器
        System.out.println(s2.getName()+"报名的课程：");
        while(cs.hasNext()){
            Course c = cs.next();
            System.out.println(c.getTitle());
        }

        // 通过课程找到哪些人报名了
        Iterator<Student> ss = c2.getStudents().iterator();
        System.out.println(c2.getTitle()+"报名的学生为：");
        while(ss.hasNext()){
            Student s = ss.next();
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
