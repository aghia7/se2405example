package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Group {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();

    public Group() {}

    public Group(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void sortStudents() {
        students.sort(Student.compareByGpa());
    }

    @Override
    public String toString() {
        String s = "A group with name: " + name +
                "\nand students:";

        for (Student student : students) {
            s += "\n" + student;
        }

        return s;
    }
}
