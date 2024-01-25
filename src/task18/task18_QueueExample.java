package task18;

import java.util.Queue;
import java.util.LinkedList;

public class task18_QueueExample{
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Элемент 1");
        queue.add("Элемент 2");
        queue.add("Элемент 3");

        boolean offered = queue.offer("Элемент 4");
        System.out.println("Добавлен элемент 4 с использованием offer(): " + offered);

        String removedElement = queue.remove();
        System.out.println("Удаленный элемент из начала очереди с remove(): " + removedElement);

        // Удаление и получение элемента из начала очереди с помощью poll()
        // null если очередь пустая
        String polledElement = queue.poll();
        System.out.println("Удаленный элемент из начала очереди с poll(): " + polledElement);

        // Получение элемента из начала очереди без удаления с помощью element()
        String firsElement = queue.element();
        System.out.println("Первый элемент из начала очереди: " + firsElement);

        // Получение элемента из начала очереди без удаления с помощью peek()
        // null если очередь пустая
        String firsElement2 = queue.peek();
        System.out.println("Первый элемент из начала очереди: " + firsElement2);
    }
}
