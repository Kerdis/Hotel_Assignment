package main.java.com.example;

public class Employee extends Person {
    private String position;
    private int id;

    public Employee(int age, String sex, double weight, double height, String name,int id, String position) {
        super(age, sex, weight, height, name);
        this.id = id; 
        this.position = position;
    }

    public String getPosition() {
        return this.position;
    }

    public int getId() {
        return this.id;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setId(int id) {
        this.id = id;
    }

}
