package HW04;

import java.util.Scanner;

public class HW04 {

    public static void main(String[] args) {
        printText(); // Task 1
        transformTemperature(); // Task 2
        calculateTriangleSquare(); // Task 3
    }


    public static void printText() {
        System.out.println("Hello User!");
        System.out.println("-------------------------");
    }

    public static void transformTemperature() {
        System.out.println("Please enter any temperature in Celsius");
        Scanner tempCelsius = new Scanner(System.in);
        double userTemp  = tempCelsius.nextDouble();
        double tempFahrenheit, tempKelvin;

        tempFahrenheit = userTemp * 9/5 + 32;
        tempKelvin = userTemp + 273.15;

        System.out.println(userTemp + " Celsius: " + tempFahrenheit + " Fahrenheit; " + tempKelvin + " Kelvin");
        System.out.println("-------------------------");
    }

    public static void calculateTriangleSquare() {
        System.out.println("Please enter the first cathetus");
        Scanner scan = new Scanner(System.in);

        int firstCathetus = scan.nextInt();

        System.out.println("Please enter the second cathetus");

        int secondCathetus = scan.nextInt();

        double triangleSquare = 0.5 * firstCathetus * secondCathetus;

        System.out.println("Triangle square is: " + triangleSquare);
        System.out.println("-------------------------");
    }
}