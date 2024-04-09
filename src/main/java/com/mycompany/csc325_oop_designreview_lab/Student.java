package com.mycompany.csc325_oop_designreview_lab;

/**
 * Class representing a student.
 *
 * @author MoaathAlrajab
 */
class Student extends Human {
    private float gpa;

    // Constructor
    public Student(String name, short age) {
        super(name, age);
    }

    @Override
    public String getAddress() {
        return null;
    }

    @Override
    public void setAddress(String address) {

    }

    // Getter and setter for GPA
    public float getGPA() {
        return gpa;
    }

    public void setGPA(float gpa) {
        this.gpa = gpa;
    }

    // Overriding toString method to print student information
    @Override
    public String toString() {
        return "Student: " + getName() + ", Age: " + getAge() + ", GPA: " + getGPA();
    }

}
