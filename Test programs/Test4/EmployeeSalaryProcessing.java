package Test4;

import java.util.Scanner;

class Employee {
    int id;
    String name;
    double basicSalary;

    Employee(int id, String name, double basicSalary) {
        if (basicSalary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }

        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateHRA() {
        return basicSalary * 0.20;
    }

    double calculateDA() {
        return basicSalary * 0.10;
    }

    double calculateGrossSalary() {
        return basicSalary + calculateHRA() + calculateDA();
    }

    double calculateTax() {
        double grossSalary = calculateGrossSalary();

        if (grossSalary <= 10000) {
            return 0;
        } else if (grossSalary <= 150000) {
            return grossSalary * 0.10;
        } else {
            return grossSalary * 0.20;
        }
    }

    double calculateNetSalary() {
        return calculateGrossSalary() - calculateTax();
    }

    void display() {
        System.out.println("ID          : " + id);
        System.out.println("Name        : " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA         : " + calculateHRA());
        System.out.println("DA          : " + calculateDA());
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Tax         : " + calculateTax());
        System.out.println("Net Salary  : " + calculateNetSalary());
        System.out.println();
    }
}

public class EmployeeSalaryProcessing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {

            try {
                System.out.println("\nEnter details of Employee " + (i + 1));

                System.out.print("Enter ID: ");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Basic Salary: ");
                double salary = sc.nextDouble();

                employees[i] = new Employee(id, name, salary);

            } catch (IllegalArgumentException e) {
                System.out.println("Invalid salary: " + e.getMessage());
                System.out.println("Please enter details again.");

                i--;
            }
        }
        System.out.println();
        System.out.println("Employee salary details:");

        for (Employee employee : employees) {
            employee.display();
        }

        Employee highest = employees[0];

        for (int i = 1; i < employees.length; i++) {
            if (employees[i].calculateNetSalary() > highest.calculateNetSalary()) {
                highest = employees[i];
            }
        }

        System.out.println("Highest Net Salary: ");
        System.out.println("Employee Name : " + highest.name);
        System.out.println("Employee ID   : " + highest.id);
        System.out.println("Net Salary    : " + highest.calculateNetSalary());

        sc.close();
    } }