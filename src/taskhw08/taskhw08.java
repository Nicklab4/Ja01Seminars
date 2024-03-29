// Реализуйте метод, который принимает на вход целочисленный массив arr:
//        - Создаёт список ArrayList, заполненный числами из исходого массива arr.
//        - Сортирует список по возрастанию и выводит на экран.
//        - Находит минимальное значение в списке и выводит на экран - Minimum is {число}
//        - Находит максимальное значение в списке и выводит на экран - Maximum is {число}
//        - Находит среднее арифметическое значений списка и выводит на экран
// - Average is =  {число}
// Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers
// принимает на вход один параметр:
// Integer[] arr - массив целых чисел.
//
//        Пример.
// Исходный массив:
// 4, 2, 7, 5, 1, 3, 8, 6, 9
// Результаты:
// [1, 2, 3, 4, 5, 6, 7, 8, 9]
// Minimum is 1
// Maximum is 9
// Average is = 5.0

package taskhw08;


import java.util.Arrays;
import java.util.ArrayList;

class Answer {
    public static void analyzeNumbers(Integer[] arr) {
        // Введите свое решение ниже
        double average = 0;
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));

        for (int value : arr) {
            average += value;
        }

        System.out.println(list.toString());
        System.out.println("Minimum is " + arr[0]);
        System.out.println("Maximum is " + arr[arr.length-1]);
        System.out.println("Average is = " + average/arr.length);
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class taskhw08 {
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer ans = new Answer();
        ans.analyzeNumbers(arr);
    }
}