import java.util.*;
import java.util.Scanner;

// start student

class Student {
    String name;
    int rollNumber;
    String location;
    int standard;
    String division;

    // Constructor

    Student(String name, int rollNumber, String location, int standard, String division) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.location = location;
        this.standard = standard;
        this.division = division;
    }
}

// end studend

// class teacher {
// char name;
// String[] subjects_teaching;
// String qualification;
// int class_assigned;
// }

// start school

public class School {
    Student[] arry = new Student[10];
    int choice = 0;
    String store;

    void onlinelist() {

        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("\nSchool Admission System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Student std");
            System.out.println("4. teacher");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    removeStudent();
                    break;

                case 3:
                    Student_std();
                    break;

                case 4:
                    teacher();
                    break;

                case 5:
                    System.out.println("Exit for system.....");
                    break;

                default:
                    System.out.println("Invalid input! Please enter 1 to 5.");
                    break;

            }
        }

        while (choice != 5);

    }

    // Add a new student

    void addStudent() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name....");
        String name = sc.nextLine();

        System.out.println("Enter location....");
        String location = sc.nextLine();

        System.out.println("Enter Rollnumber....");
        int rollNumber = sc.nextInt();

        System.out.println("Enter Standard....");
        int standard = sc.nextInt();

        System.out.println("Enter Division....");
        String division = sc.next();

        Student addStudent = new Student(name, rollNumber, location, standard, division);

    }

    // Remove a student by roll number

    void removeStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name....");
        String name = sc.nextLine();

        System.out.println("Enter location....");
        String location = sc.nextLine();

        System.out.println("Enter Rollnumber....");
        int rollNumber = sc.nextInt();

        System.out.println("Enter Standard....");
        int standard = sc.nextInt();

        System.out.println("Enter Division....");
        String division = sc.next();

        Student removeStudent = new Student(name, rollNumber, location, standard, division);
    }

    // display all Student_std

    void Student_std() {

    }

    // display all teacher

    void teacher() {
        System.out.println();
    }

    // Display all students

    void displayStudents() {
        System.out.println("Student List:");
    }

    public static void main(String[] args) {
        School school = new School();
        school.onlinelist();

    }
}