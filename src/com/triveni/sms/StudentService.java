package com.triveni.sms;

import java.util.ArrayList;

public class StudentService {

    private final ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {

        for (Student s : students) {
            if (s.getId().equals(student.getId())) {
                System.out.println("Student with this ID already exists!");
                return;
            }
        }

        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : students) {
                System.out.println(s);   // calls toString()
            }
        }
    }

    public void deleteStudent(String id) {

        Student toRemove = null;

        for (Student s : students) {
            if (s.getId().equals(id)) {
                toRemove = s;
                break;
            }
        }

        if (toRemove != null) {
            students.remove(toRemove);
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void searchStudent(String id) {

        for (Student s : students) {
            if (s.getId().equals(id)) {
                System.out.println(s);
                return;
            }
        }

        System.out.println("Student not found.");
    }

    public void updateMarks(String id, double newMarks) {

        for (Student s : students) {
            if (s.getId().equals(id)) {
                s.setMarks(newMarks);
                System.out.println("Marks updated successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }
}
