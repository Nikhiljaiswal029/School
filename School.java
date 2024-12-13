import java.util.*;
import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    String location;
    double feesPaid;

    // Constructor

    Student(String name, int rollNumber, String location) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.location = location;
        this.feesPaid = 0.0;
    }
}

public class School {
    Student[] arry = new Student[10];
    int choice = 0;

    void onlinelist() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nSchool Admission System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Pay Fees");
            System.out.println("4. Display All Students");
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
                    payFees();
                    break;

                case 4:
                    displayStudents();
                    break;

                case 5:
                    System.out.println("Exit for system.....");
                    break;

                default:
                    System.out.println("Invalid input! Please enter 1 to 5.");
                    break;

            }
        } while (choice != 5);
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

        Student addStudent = new Student(name, rollNumber, location);
      

    }

    // Remove a student by roll number

    void removeStudent() {
        System.out.println();
    }

    // Pay fees for a student

    void payFees() {
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
