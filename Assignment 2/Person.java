public class Person {
    private int age;
    private double height;
    private double weight;

    // Constructor to initialize all attributes
    public Person(int age, double height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    // Constructor to initialize 

    // Method to display person details
    public void display() {
        System.out.println("Person details:");
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " kg");
    }

    // Main method
    public static void main(String[] args) {
        Person person1 = new Person(25, 68.5, 150);
        Person person2 = new Person(30, 0, 0);
        Person person3 = new Person(35,72.0, 0);
        Person person4 = new Person(0, 90, 80);

        // Display details of each person
        person1.display();
        System.out.println();
        person2.display();
        System.out.println();
        person3.display();
        System.out.println();
        person4.display();
    }
}
