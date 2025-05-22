package HW09.task2;

public class Main {
    public static void main(String[] args) {
        // Виклик методів суперкласу (працюють для усіх дочірніх класів)
        System.out.println("Сума = " + Calculator.sumNumbers(5, 10));
        System.out.println("Різниця = " + EngineeringCalc.subNumbers(50.5, 250));
        System.out.println("Добуток = " + ProgrammerCalc.multiplyNumbers(2, 50));
        System.out.println("----------------------------------------------");

        // Виклик методів дочірнього класу EngineeringCalc
        System.out.println("Піднесення числа до степеня = " + EngineeringCalc.power(5, 2));
        System.out.println("Корінь квадратний з числа = " + EngineeringCalc.squareRoot(25));
        System.out.println("Корінь кубічний з числа = " + EngineeringCalc.cubeRoot(27));
        System.out.println("----------------------------------------------");

        // Виклик методів дочірнього класу ProgrammerCalc
        System.out.println("Число у двійковій системі = " + ProgrammerCalc.toBinary(100));
        System.out.println("Число у вісімковій системі = " + ProgrammerCalc.toOctal(100));
        System.out.println("Число у шістнадцятковій системі = " + ProgrammerCalc.toHex(100));
        System.out.println("----------------------------------------------");
    }
}
