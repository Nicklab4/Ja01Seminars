package task10;
import java.util.ArrayList;

public class task10 {
    public static void main(String[] args){
        // Создаем объект ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Добавляем элементы
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Получаем элемент по индексу
        int secondNumber = numbers.get( 1);
        System.out.println(secondNumber);

        // Изменяем элемент по индексу
        numbers.set(0, 5);
        System.out.println(numbers);

        // Удаляем элемент по индексу
        numbers.remove(2);
        System.out.println(numbers);

        // Проверяем наличие элемента
        boolean containsTwenty = numbers.contains(20);
        System.out.println(containsTwenty);
    }
}
