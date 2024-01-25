package task11;
import java.util.ArrayList;
import java.util.List;

public class task11 {
    public static void main(String[] args) {
        // Создаем объект списка с использованием List
        List<String> fruits = new ArrayList<String>();

        // добавляем элементы в список
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Апельсин");

        // Получаем размер списка
        int size = fruits.size();
        System.out.println("size: " + size);

        // Получаем Элемент по индексу
        String firstFruits = fruits.get(0);
        System.out.println("first: " + firstFruits);

        // Перебираем элементы списка
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Удаляем элемент по значению
        fruits.remove("Банан");
        System.out.println("После удаления 'банана': " +fruits);
    }
}
