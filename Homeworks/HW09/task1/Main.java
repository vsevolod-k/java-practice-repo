package HW09.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(3, 5, 4));
        shapes.add(new Rectangle(2, 3, 8, 7));
        shapes.add(new Triangle(0, 0, 4, 0, 2, 3));

        for (Shape shape : shapes) {
            shape.paint();
            System.out.println("Площа: " + shape.calculateArea());
            System.out.println("Периметр: " + shape.calculatePerimeter());
            System.out.println("-----------------------");
        }
    }
}
