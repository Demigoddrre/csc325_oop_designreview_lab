package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student {

    private int credits;

    public Freshman(String name, int age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    // Add getters and setters for the credits field
    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        // Implement the toString method to provide a string representation of the Freshman object
        return "Freshman{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", address='" + getAddress() + '\'' +
                ", gpa=" + getGpa() +
                ", credits=" + credits +
                '}';
    }
}
