package 交大慧谷.day11.j02一对多;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args){
        School school = new School("交大");
        Student s1 = new Student("zhumei", 30);
        Student s2 = new Student("ameng", 40);
        Student s3 = new Student("ali", 20);

        s1.setSchool(school);
        s2.setSchool(school);
        s3.setSchool(school);

        school.getStudents().add(s1);
        school.getStudents().add(s2);
        school.getStudents().add(s3);

//        ArrayList<Student>  ss = new ArrayList<Student>();
//        ss.add(s1);
//        ss.add(s2);
//        ss.add(s3);
//
//        school.setStudents(ss);

        //通过学生找到他所就读的学校
        System.out.println(s2.getSchool().getTitle());

        //通过学校找到该校有哪些学生
        Iterator<Student> it = school.getStudents().iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
