package main.java.com.example;

public class Guest extends Person {
    private int id;
    private boolean breakfast;

    public Guest(int age, String sex, double weight, double height, String name) {
        super(age, sex, weight, height, name);
        this.id = id;
        this.breakfast = false;
    }

    public int getId() {
        return this.id;
    }

    public boolean getBreakfast() {
        return this.breakfast;
    }

    public void setId(int getId) {
        this.id = id;
    }

    public void setBreakfast(boolean breakfast) {
        this.breakfast = breakfast;
    }

}


