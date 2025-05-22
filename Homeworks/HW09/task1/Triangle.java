package HW09.task1;

public class Triangle extends Shape {
    private int x1, y1;
    private int x2, y2;
    private int x3, y3;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    private int distance(int xA, int yA, int xB, int yB) {
        return (int) Math.sqrt(Math.pow(xB - xA, 2) + Math.pow(yB - yA, 2));
    }

    @Override
    public double calculateArea() {
        double a = distance(x1, y1, x2, y2);
        double b = distance(x2, y2, x3, y3);
        double c = distance(x3, y3, x1, y1);
        double s = (a + b + c) / 2;
        return (int) Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double calculatePerimeter() {
        double a = distance(x1, y1, x2, y2);
        double b = distance(x2, y2, x3, y3);
        double c = distance(x3, y3, x1, y1);
        return a + b + c;
    }

    @Override
    public void paint() {
        System.out.println("Трикутник з вершинами:");
        System.out.println("A: (" + x1 + ", " + y1 + ")");
        System.out.println("B: (" + x2 + ", " + y2 + ")");
        System.out.println("C: (" + x3 + ", " + y3 + ")");
    }
}
