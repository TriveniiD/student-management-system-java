package com.triveni.sms;

public class Student {

    private String id;
    private String name;
    private String branch;
    private double marks;

    public Student(String id, String name, String branch, double marks) {

        // Validate ID: must be exactly 10 digits
        if (id == null || !id.matches("\\d{10}")) {
            throw new IllegalArgumentException("ID must be exactly 10 digits.");
        }

        this.id = id;
        this.name = name;
        this.branch = branch;
        this.marks = marks;
    }

    public String getId() {
        return id;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Branch: " + branch +
                ", Marks: " + marks;
    }
}
