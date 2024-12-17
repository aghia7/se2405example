import models.BadStudent;
import models.Group;
import models.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        Locale.setDefault(Locale.US);
        File file = new File("src/input.txt");

        Scanner sc = new Scanner(file);

        Group group = new Group("SE-2405");


        while (sc.hasNext()) {
            Student student = new Student(sc.next(), sc.next(), sc.nextDouble());

            group.addStudent(student);
        }

        BadStudent badStudent = new BadStudent("JamanBala", "CopyPastev", 0.001);

        group.addStudent(badStudent);

        group.sortStudents();

        System.out.println(group);

        badStudent.cheat();
    }
}
