package 交大慧谷.day11.j02一对多;

import java.util.ArrayList;

public class School {
    private String title;
    private ArrayList<Student> students = new ArrayList<>();

//    public School(){
//        this.students = new ArrayList<Student>();
//    }

    public School(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
