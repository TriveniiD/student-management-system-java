package com.triveni.sms;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Search Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    try {
                        System.out.print("Enter 10-digit ID: ");
                        String id = sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Branch: ");
                        String branch = sc.nextLine();

                        System.out.print("Enter Marks: ");
                        double marks = sc.nextDouble();
                        sc.nextLine(); // clear buffer

                        service.addStudent(new Student(id, name, branch, marks));

                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    service.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    String deleteId = sc.nextLine();
                    service.deleteStudent(deleteId);
                    break;

                case 4:
                    System.out.print("Enter ID to search: ");
                    String searchId = sc.nextLine();
                    service.searchStudent(searchId);
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
