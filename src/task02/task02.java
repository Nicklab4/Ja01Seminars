package task02;

public class task02 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Сложение: " + sum(a, b));
        System.out.println("Вычитание: " + subtract(a, b));
    }

    //Метод сложения двух чисел
    public static int sum(int a, int b) {
        return a + b;
    }

    //Метод вычитания двух чисел
    public static int subtract(int a, int b) {
        return a - b;
    }

    //Метод умножения двух чисел
    public static int multiply(int a, int b) {
        return a * b;
    }

    //Метод деления двух чисел
    public static int divide(int a, int b) {
        return a / b;
    }

    //Метод проверки четности числа
    public static boolean isEven(int a) {
        return a % 2 == 0;
    }


    //метод возведения в степень числа
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}