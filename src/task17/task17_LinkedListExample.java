package task17;

import java.util.LinkedList;
import java.util.List;

public class task17_LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Первый");
        linkedList.add("Второй");
        linkedList.add("Самый последний");

        System.out.println("Список после добавления в начало: " + linkedList);

        String firstElement = linkedList.getFirst();
        System.out.println("Первый элемент списка: " + firstElement);

        String lastElement = linkedList.getLast();
        System.out.println("Последний элемент списка: " + lastElement);

        String removedFirst = linkedList.removeFirst();
        System.out.println("Удалённый первый элемент: " + removedFirst);
        System.out.println("Список после удаления: " + linkedList);

        linkedList.add("Первый");
        linkedList.add("Второй");
        linkedList.add("Третий");

        String removedLast = linkedList.removeLast();
        // Если список пуст - будет выброшено исключение
        System.out.println("Удалённый последний элемент: " + removedLast);
        System.out.println("Список после удаления: " + linkedList);

        String removedElement = linkedList.pollLast();
        // Если список пуст - будет возвращено значение null
        System.out.println("Удалённый последний элемент: " + removedElement);
        System.out.println("Список после удаления: " + linkedList);

        // Добавляем элемент в начало списка
        // При успешной вставке метод возвращает значение - true
        // Если список достиг какого-то предела и значение не может быть добавлено то
        // будет возвращено - false
        // linkedList.addFirst("") - при невозможности добавления, вызовет иключение

        Boolean b1 = linkedList.offerFirst("Новый элемент в начало");
        System.out.println("Значение b1: " + b1);
        System.out.println("Список после Добавления: " + linkedList);
    }
}
