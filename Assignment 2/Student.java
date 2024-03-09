public class Student {
    private String name;
    private int marks1;
    private int marks2;
    private int marks3;

    // Constructor
    public Student(String name, int marks1, int marks2, int marks3) {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    // Function to assign initial value
    public void assignInitialValues(String name, int marks1, int marks2, int marks3) {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    // Function to calculate total and average marks
    public int[] computeTotalAverage() {
        int totalMarks = marks1 + marks2 + marks3;
        int averageMarks = totalMarks / 3;
        return new int[]{totalMarks, averageMarks};
    }

    // Function to display student details
    public void displayDetails() {
        int result[] = computeTotalAverage();
        int totalMarks = result[0];
        System.out.println("Name: " + name);
        System.out.println(("Total marks obtained: " + totalMarks));
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance of the Student class
        Student student1 = new Student(" ", 0 ,0, 0);

        // Assign initial values
        student1.assignInitialValues("John", 80, 75, 90);

        // Display student details
        student1.displayDetails();
    }
}
