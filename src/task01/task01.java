package task01;

public class task01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Cложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("умножение: " + (a * b));
        System.out.println("Деление: " + (a / b));

        double c = 2.5;
        double d = 1.5;

        System.out.println("Cложение: " + (c + d));
        System.out.println("Вычитание: " + (c - d));
        System.out.println("умножение: " + (c * d));
        System.out.println("Деление: " + (c / d));

        if (a > b) {
            System.out.println("a > b"); }
        else {
            System.out.println("a <= b");
        }

        System.out.println("Цикл for от 1 до 5");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("Цикл while от 6 до 10");
        int count = 6;
        while (count <= 10) {
            System.out.println(count);
            count++;
        }

        boolean isEven = (a % 2 == 0);
        System.out.println("Число а четное: " + isEven);


    }
}