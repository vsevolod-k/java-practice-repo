import java.util.Scanner;

public class Main {

    public static void main() {
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
        double userTemp  = tempCelsius.nextInt();
        double tempFahrenheit, tempKelvin;

        tempFahrenheit = userTemp * 9/5 + 32;
        tempKelvin = userTemp + 273.15;

        System.out.println(userTemp + " Celsius: " + tempFahrenheit + " Fahrenheit; " + tempKelvin + " Kelvin");
        System.out.println("-------------------------");
    }

    public static void calculateTriangleSquare() {
        System.out.println("Please enter cat");
        Scanner scan = new Scanner(System.in);

        int userCat = scan.nextInt();

        System.out.println("Please enter hypotenuse");

        int userHypotenuse = scan.nextInt();

        double triangleSquare = 0.5 * userCat * userHypotenuse;

        System.out.println("Triangle square is: " + triangleSquare);
        System.out.println("-------------------------");
    }
}