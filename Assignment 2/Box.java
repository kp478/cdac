public class Box {
    private double height;
    private double width;
    private double breadth;

    public Box(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public double getVolume() {
        return height * width * breadth;
    }

    public double getSurfaceArea() {
        return 2 * (height * width + width * breadth + breadth * height);
    }

    public static void main(String[] args) {
        Box box1 = new Box(4, 6, 8);
        Box box2 = new Box(11, 13, 15);

        System.out.println("Box 1 Vol = " + box1.getVolume() + " Box 1 Surface Area = " + box1.getSurfaceArea());
        System.out.println("Box 2 Vol = " + box2.getVolume() + " Box 1 Surface Area = " + box2.getSurfaceArea());
    }
}
