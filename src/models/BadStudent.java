package models;

public class BadStudent extends Student {

    public BadStudent() {}

    public BadStudent(String name, String surname, double gpa) {
        super(name, surname, gpa);
    }

    public void cheat() {
        System.out.println(getName() + " " + getSurname() + " is cheating as usually!");
    }
}
