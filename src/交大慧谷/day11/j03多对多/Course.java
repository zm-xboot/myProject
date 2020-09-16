package 交大慧谷.day11.j03多对多;

import java.util.ArrayList;

public class Course {
    private String title;
    private ArrayList<Student> students = new ArrayList<Student>();

    public Course(String title) {
        super();
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
