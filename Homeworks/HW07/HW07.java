package HW07;

import java.util.Arrays;

public class HW07 {
    public static void main(String[] args) {
        isPalindrome("тест"); // Task 1
        minMaxNumOption1(new int[]{5, -329138921, 2000, 6000, 300, -666, 5959, 1}); // Task 2 using Arrays.sort()
        minMaxNumOption2(new int[]{5, -329138921, 2000, 6000, 300, -666, 5959, 1}); // Task 2 using for loop
        removeEven(new int[]{5, -100, 2001, 0, 300, -333, 5959, 1}); // Task 3
        printSin(); // Task 4
        mainDiagonalNumbers(new int[][]{{3, -1, 7}, {-4, 0, 2}, {5, -6, -8}}); // findElements(); *Task 5
    }

    public static void isPalindrome(String userWord) {
        char[] userWordArray = userWord.toCharArray();
        String reversedWord = "";

        for (char c : userWordArray) {
            reversedWord = c + reversedWord;
        }

        System.out.println(
                userWord.equals(reversedWord) ? "The word is a palindrome!" : "The word is NOT a palindrome!"
        );
        System.out.println("---------------------------------------");
    }

    public static void minMaxNumOption1(int[] userArray) {
        Arrays.sort(userArray);

        int minNum = userArray[0];
        int maxNum = userArray[userArray.length - 1];

        System.out.println("Min number: " + minNum + ", " + "Max number: " + maxNum);
        System.out.println("---------------------------------------");
    }

    public static void minMaxNumOption2(int[] userArray) {
        int minNum = 0;
        int maxNum = 0;

        for (int i = 0; i < userArray.length - 1; i++) {

            if (userArray[i] > userArray[i + 1] && minNum > userArray[i + 1]) {
                minNum = userArray[i + 1];
            }

            if (userArray[i] > userArray[i + 1] && maxNum < userArray[i]) {
                maxNum = userArray[i];
            }
        }
        System.out.println("Min number: " + minNum + ", " + "Max number: " + maxNum);
        System.out.println("---------------------------------------");
    }

    public static void removeEven(int[] userArray) {

        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] % 2 == 0) {
                userArray[i] = 0;
            }
        }

        System.out.println(Arrays.toString(userArray));
        System.out.println("---------------------------------------");
    }

    public static void printSin() { // джипітішив спосіб формування виводу у формі "таблиці"
        double[] sinValueArr = new double[37];

        for (int i = 0; i <= 360; i += 10) {
            sinValueArr[i / 10] = Math.sin(Math.toRadians(i));
        }

        for (int i = 0; i < sinValueArr.length; i++) {
            int angleValue = i * 10;
            System.out.printf("sin(%3d°) = %.4f%n", angleValue, sinValueArr[i]);
        }
        System.out.println("---------------------------------------");
    }

    public static void mainDiagonalNumbers(int[][] ints) { // джипітішив

        int sumOddNumbers = 0;

        for (int i = 0; i < ints.length; i++) {
            for (int j = i + 1; j < ints[i].length; j++) {
                if (ints[i][j] % 2 != 0) {
                    sumOddNumbers += ints[i][j];
                }
            }
        }

        int countNegativeNumbers = 0;

        for (int i = 1; i < ints.length; i++) {
            for (int j = 0; j < i; j++) {
                if (ints[i][j] < 0) {
                    countNegativeNumbers++;
                }
            }
        }

        System.out.println("Кількість непарних елементів під головною діагоналлю: " + countNegativeNumbers);
        System.out.println("Сума непарних елементів над головною діагоналлю: " + sumOddNumbers);
    }
}