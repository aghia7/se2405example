package models;

import java.util.Comparator;

public class Student extends Person {
    private double gpa;

    public Student() {}

    public Student(String name, String surname, double gpa) {
        super(name, surname);

        setGpa(gpa);
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public static Comparator<Student> compareByGpa() {
        return new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.gpa > o2.gpa) return 1;
                if (o1.gpa < o2.gpa) return -1;

                return 0;
            }
        };
    }

    @Override
    public String toString() {
        return super.toString() + " gpa: " + gpa;
    }
}
