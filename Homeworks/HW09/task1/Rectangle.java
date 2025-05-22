package HW09.task1;

public class Rectangle extends Shape {
    private int x1, y1;
    private int x2, y2;

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getWidth() {
        return Math.abs(x2 - x1);
    }

    public int getHeight() {
        return Math.abs(y2 - y1);
    }

    @Override
    public double calculateArea() {
        return getWidth() * getHeight();
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    @Override
    public void paint() {
        System.out.println("Прямокутник з вершинами: (" + x1 + ", " + y1 + ") і (" + x2 + ", " + y2 + ")");
    }
}
