public class Room {

    float height;
    float width;
    float breadth;

    public Room(float height, float width, float breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public float volume() {
        return this.height * this.width * this.breadth;
    }

    public static void main(String[] args) {
        // Create two room instances
        Room room1 = new Room(10, 12, 8);
        Room room2 = new Room(15, 18, 9);

        // Display the volume of each room
        System.out.println("Volume of room 1: " + room1.volume());
        System.out.println("Volume of room 2: " + room2.volume());
    }
}