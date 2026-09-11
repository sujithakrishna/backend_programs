package Test4;

import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int[] marks;

    Student(int rollNo, String name, int[] marks) {
        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new IllegalArgumentException(
                        "Marks should be between 0 and 100"
                );
            }
        }

        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    int calculateTotal() {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    double calculateAverage() {
        return calculateTotal() / 5.0;
    }

    boolean isPass() {
        for (int mark : marks) {
            if (mark < 35) {
                return false;
            }
        }

        return true;
    }

    char calculateGrade() {
        double average = calculateAverage();

        if (!isPass()) {
            return 'F';
        } else if (average >= 90) {
            return 'A';
        } else if (average >= 75) {
            return 'B';
        } else if (average >= 60) {
            return 'C';
        } else {
            return 'D';
        }
    }

    void display() {
        System.out.println("Roll No  : " + rollNo);
        System.out.println("Name     : " + name);

        System.out.print("Marks    : ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }

        System.out.println();
        System.out.println("Total    : " + calculateTotal());
        System.out.println("Average  : " + calculateAverage());
        System.out.println("Grade    : " + calculateGrade());

        if (isPass()) {
            System.out.println("Result   : PASS");
        } else {
            System.out.println("Result   : FAIL");
        }

        System.out.println("-----------------------------");
    }
}

public class Student_Management {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            try {
                System.out.println("\nEnter details of Student " + (i + 1));
                System.out.print("Enter Roll No: ");
                int rollNo = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                int[] marks = new int[5];
                System.out.println("Enter marks for 5 subjects:");
                for (int j = 0; j < 5; j++) {
                    System.out.print("Subject " + (j + 1) + ": ");
                    marks[j] = sc.nextInt();
                }
                students[i] = new Student(rollNo, name, marks);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid marks: " + e.getMessage());
                System.out.println("Please enter the student details again.");
                i--;
            }
        }
        System.out.println("Results:");
        for (Student student : students) {
            student.display();
        }

        Student topStudent = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].calculateTotal() > topStudent.calculateTotal()) {
                topStudent = students[i];
            }
        }
        System.out.println("Top Student: ");
        System.out.println("Roll No : " + topStudent.rollNo);
        System.out.println("Name    : " + topStudent.name);
        System.out.println("Total   : " + topStudent.calculateTotal());
        System.out.println("Average : " + topStudent.calculateAverage());
        System.out.println("Grade   : " + topStudent.calculateGrade());

        sc.close();
    }
}