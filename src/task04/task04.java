package task04;

import java.util.Arrays;
import java.util.List;

public class task04{
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 2, 5};

        Arrays.sort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));

        int index = Arrays.binarySearch(array, 6);
        System.out.println("Индекс 6: " + index);

        int[] arrayCopy = {10, 4, 6, 2, 5};
        Arrays.sort(arrayCopy);
        boolean areEqual = Arrays.equals(array, arrayCopy);
        System.out.println("Массивы равны: " + areEqual);

        int[] newArray = new int[5];
        Arrays.fill(newArray, 7);
        System.out.println("Заполненный массив: " + Arrays.toString(newArray));

        int[] arrayCopy2 = Arrays.copyOf(array, 2);
        System.out.println("Копия массива: " + Arrays.toString(arrayCopy2));

        List<Integer> list = Arrays.asList(1, 2, 3, 4 , 5);
        System.out.println("Список: " + Arrays.toString(list.toArray()));
        System.out.println("Список: " + list.toString());
        Integer[] listArray = list.toArray(new Integer[0]);
        System.out.println("Список преобразован в массив: " + Arrays.toString(listArray));

        int[][] multiArray = {{1, 2, 3}, {4, 5, 6} };
        System.out.println("Многомерный массив: " + Arrays.deepToString(multiArray));
    }
}
