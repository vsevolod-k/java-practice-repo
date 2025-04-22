public class Main {

    public static void main(String[] args) {
        printText(); // Task 1
        transformTemperature(25); // Task 2
        calculateTriangleSquare(3, 5); // Task 3
    }


    public static void printText() {
        System.out.println("Hello World!");
    }

    public static void transformTemperature(double c) {
        double tempCelsius = c;
        double tempFahrenheit, tempKelvin;

        tempFahrenheit = c * 9/5 + 32;
        tempKelvin = c + 273.15;

        System.out.println(tempCelsius + " Celsius: " + tempFahrenheit + " Fahrenheit; " + tempKelvin + " Kelvin");
    }

    public static void calculateTriangleSquare(double i, double i1) {
        double triangleSquare;

        triangleSquare = 0.5 * i * i1;

        System.out.println(triangleSquare);
    }
}
