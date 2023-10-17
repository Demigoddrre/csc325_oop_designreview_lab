/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human{

    private double gpa; // Added field for GPA
    private String address;
    public Student(String name, int age) {
        super(name, age);
    }// Calls the constructor of the parent class Human

    @Override // Override the getAddress method from the parent class Human
    public String getAddress() {
        return address ;
    }

    @Override // Override the setAddress method from the parent class Human
    public void setAddress(String address) {
    this.address = address;
    }

    // Getter for GPA
    public double getGpa() {
        return gpa;
    }

    // Setter for GPA
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Add a toString method to provide a string representation of the Student object
    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", address='" + address + '\'' +
                ", gpa=" + gpa +
                '}';
    }
    // ToDo 1: Make this class a child of Human

	// ToDo 2: Fix the resulting errors

	// ToDo 3: Add a field for GPA and create a setter and a getter
	
	// ToDo 4: Add comments to your code
}
