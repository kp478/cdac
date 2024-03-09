import java.util.Scanner;

class Student {
    private String name;
    private int marks1, marks2, marks3;

    // Function to assign initial values
    public void assignValues(String name, int marks1, int marks2, int marks3) {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    // Function to compute total average
    public double computeAverage() {
        return (marks1 + marks2 + marks3) / 3.0;
    }

    // Function to display student's name and total marks
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + (marks1 + marks2 + marks3));
    }
}

public class Student_que2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an object of Student class
        Student student = new Student();

        // Assign initial values
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter marks in subject 1: ");
        int marks1 = scanner.nextInt();
        System.out.print("Enter marks in subject 2: ");
        int marks2 = scanner.nextInt();
        System.out.print("Enter marks in subject 3: ");
        int marks3 = scanner.nextInt();
        
        student.assignValues(name, marks1, marks2, marks3);

        // Display student's name and total marks
        student.display();

        // Display average marks
        System.out.println("Average Marks: " + student.computeAverage());

        scanner.close();
    }
}