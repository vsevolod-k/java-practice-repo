package HW09.task2;

public class EngineeringCalc extends Calculator{
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double squareRoot(double num) {
        return Math.sqrt(num);
    }

    public static double cubeRoot(double num) {
        return Math.cbrt(num);
    }
}
