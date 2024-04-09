package com.mycompany.csc325_oop_designreview_lab;

/**
 * Class representing a Freshman student.
 *
 * @author MoaathAlrajab
 */
class Freshman extends Student {
    private int credits;

    // Constructor
    public Freshman(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    // Overriding toString method to print Freshman information
    @Override
    public String toString() {
        return "Freshman: " + getName() + ", Age: " + getAge() + ", GPA: " + getGPA() + ", Credits: " + credits;
    }
}
