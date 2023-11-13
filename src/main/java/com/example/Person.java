package main.java.com.example;

public class Person {
    private int age;
    private String sex;
    private double weight;
    private double height;
    private String name;

    public Person(int age, String sex, double weight, double height, String name) {
        this.age = age;
        this.sex = sex;
        this.weight = weight;
        this.height = height; 
        this.name = name;
    }

    public int getAge() {
        return this.age; 
    }

    public String getSex() {
        return this.sex;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getHeight() {
        return this.height;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }
}

