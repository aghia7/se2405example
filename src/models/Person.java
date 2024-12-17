package models;

public class Person {
    private int id;
    private String name;
    private String surname;
    private static int id_gen = 1;

    private void generateID() {
        id = id_gen++;
    }

    public Person(){
        generateID();
    }

    public Person(String name, String surname) {
        this();
        setName(name);
        setSurname(surname);
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + surname;
    }
}
