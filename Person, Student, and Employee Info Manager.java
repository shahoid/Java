import java.util.Scanner;

class Person {
    String name;
    int birthYear;
    double height;
    double weight;
    String address;

    void setPersonDetails(String name, int birthYear, double height, double weight, String address) {
        this.name = name;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
        this.address = address;
    }

    int calculateAge(int currentYear) {
        return currentYear - birthYear;
    }
}

class Student extends Person {
    int rollNo;
    double marks;

    void setStudentDetails(int rollNo, double marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    double calculateAvg() {
        return marks;
    }
}

class Employee extends Person {
    int empId;
    double salary;

    void setEmployeeDetails(int empId, double salary) {
        this.empId = empId;
        this.salary = salary;
    }

    double calculateTax() {
        return salary * 0.1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter birth year: ");
        int birthYear = scanner.nextInt();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        System.out.print("Enter weight: ");
        double weight = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        System.out.print("Enter roll number: ");
        int rollNo = scanner.nextInt();
        System.out.print("Enter marks: ");
        double marks = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter employee ID: ");
        int empId = scanner.nextInt();
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();

        int currentYear = 2024; // Assuming the current year is 2024

        Person person = new Person();
        person.setPersonDetails(name, birthYear, height, weight, address);

        Student student = new Student();
        student.setPersonDetails(name, birthYear, height, weight, address);
        student.setStudentDetails(rollNo, marks);

        Employee employee = new Employee();
        employee.setPersonDetails(name, birthYear, height, weight, address);
        employee.setEmployeeDetails(empId, salary);

        System.out.println("\nPerson Details:");
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.calculateAge(currentYear));
        System.out.println("Height: " + person.height);
        System.out.println("Weight: " + person.weight);
        System.out.println("Address: " + person.address);

        System.out.println("\nStudent Details:");
        System.out.println("Roll Number: " + student.rollNo);
        System.out.println("Marks: " + student.marks);
        System.out.println("Average Marks: " + student.calculateAvg());

        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + employee.empId);
        System.out.println("Salary: " + employee.salary);
        System.out.println("Tax: " + employee.calculateTax());

        scanner.close();
    }
}
