package com.mycompany.csc325_oop_designreview_lab;

/**
 * Class representing a Senior student.
 *
 * @author MoaathAlrajab
 */
class Senior extends Student {
    private int credits;

    // Constructor
    public Senior(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    // Overriding toString method to print Senior information
    @Override
    public String toString() {
        return "Senior: " + getName() + ", Age: " + getAge() + ", GPA: " + getGPA() + ", Credits: " + credits;
    }
}
