package HW06;

public class HW06 {
    public static void main(String[] args) {
        CheckOddEven(4); // Task 1
        PrintMonthInWordOption1(5); // Task 2 using If
        PrintMonthInWordOption2(9); // Task 2 using Switch
        CheckAbsValue(3, -9); // Task 3
        IsTriangleIsosceles(3, 3, 5); // Task 4
        ReturnMiddleCharacters("Java"); // Task 5
    }

    public static void CheckOddEven(int userNum) {
        // Перевірка, чи є число парним
        if (userNum % 2 == 0) {
            System.out.println("Even number"); // Виводимо, якщо число парне
        } else {
            System.out.println("Odd number"); // Виводимо, якщо число непарне
        }

        System.out.println("BYE");
        System.out.println("------------------------------------");
    }

    public static void PrintMonthInWordOption1(int userMonth) {
        // Варіант вирішення задачі з використанням if statement
        // Виводимо назву місяця у вигляді трилітерного скорочення на основі номера місяця
        // Якщо номер не відповідає жодному з 1 по 12 — виводимо повідомлення про помилку
        if (userMonth == 1) {
            System.out.println("JAN");
        } else if (userMonth == 2) {
            System.out.println("FEB");
        } else if (userMonth == 3) {
            System.out.println("MAR");
        } else if (userMonth == 4) {
            System.out.println("APR");
        } else if (userMonth == 5) {
            System.out.println("MAY");
        } else if (userMonth == 6) {
            System.out.println("JUN");
        } else if (userMonth == 7) {
            System.out.println("JUL");
        } else if (userMonth == 8) {
            System.out.println("AUG");
        } else if (userMonth == 9) {
            System.out.println("SEP");
        } else if (userMonth == 10) {
            System.out.println("OCT");
        } else if (userMonth == 11) {
            System.out.println("NOV");
        } else if (userMonth == 12) {
            System.out.println("DEC");
        } else {
            System.out.println("Not a valid month"); // Повідомлення, якщо введено некоректний номер місяця
        }
        System.out.println("------------------------------------");
    }

    public static void PrintMonthInWordOption2(int userMonth) {
        // Варіант вирішення задачі з використанням switch
        // Виводимо назву місяця у вигляді трилітерного скорочення на основі номера місяця
        // Якщо номер не відповідає жодному з 1 по 12 — виводимо повідомлення про помилку
        switch(userMonth) {
            case 1:
                System.out.println("JAN");
                break;
            case 2:
                System.out.println("FEB");
                break;
            case 3:
                System.out.println("MAR");
                break;
            case 4:
                System.out.println("APR");
                break;
            case 5:
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("JUN");
                break;
            case 7:
                System.out.println("JUL");
                break;
            case 8:
                System.out.println("AUG");
                break;
            case 9:
                System.out.println("SEP");
                break;
            case 10:
                System.out.println("OCT");
                break;
            case 11:
                System.out.println("NOV");
                break;
            case 12:
                System.out.println("DEC");
                break;
            default:
                System.out.println("Not a valid month"); // Повідомлення, якщо введено некоректний номер місяця
                break;
        }
        System.out.println("------------------------------------");
    }

    public static void CheckAbsValue(int firstNum, int secondNum) {
        // Порівнюємо абсолютні значення двох чисел та виводимо відповідне повідомлення
        System.out.println(
                Math.abs(firstNum) > Math.abs(secondNum) ? "The first number has a greater absolute value" :
                        Math.abs(secondNum) > Math.abs(firstNum) ? "The second number has a greater absolute value" :
                                "The absolute value of both numbers is the same"
        );
        System.out.println("------------------------------------");
    }

    public static void IsTriangleIsosceles(int a, int b, int c) {
        // Перевіряємо, чи трикутник є рівнобедреним (якщо хоча б дві сторони рівні)
        System.out.println(
                (a == b || a == c || b == c) ? "Triangle is isosceles" :
                        "Triangle is not isosceles"
        );
        System.out.println("------------------------------------");
    }

    public static void ReturnMiddleCharacters(String userWord) {

        if (userWord.length() % 2 > 0) { // перевірка довжини слова на непарність
            System.out.println("Incorrect word"); // повідомлення, якщо кількість символів непарна
        } else {
            int middleWord = userWord.length() / 2; // індекс середини рядка
            String newWord = userWord.substring(middleWord - 1, middleWord + 1); // отримуємо два середніх символи
            System.out.println("Two middle characters: " + newWord); // повідомлення, яке виводить два середніх символи
        }
    }
}
