package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {

    private int credits;

    public Senior(String name, int age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    // Add getters and setters for the credits field
    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        if (credits >= 85) {
            this.credits = credits;
        } else {
            System.out.println("Senior class should have a minimum of 85 credits. Setting to 85.");
            this.credits = 85; // Set to the minimum required
        }
    }

    @Override
    public String toString() {
        // Implement the toString method to provide a string representation of the Senior object
        return "Senior{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", address='" + getAddress() + '\'' +
                ", gpa=" + getGpa() +
                ", credits=" + credits +
                '}';
    }
}
