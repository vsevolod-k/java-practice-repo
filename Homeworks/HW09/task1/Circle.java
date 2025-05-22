package HW09.task1;

public class Circle extends Shape {
    private int centerX;
    private int centerY;
    private double radius;

    public Circle(int centerX, int centerY, double radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void paint() {
        System.out.println("Центр кола: (" + centerX + ", " + centerY + ")");
        System.out.println("Радіус кола: " + radius);
    }
}
