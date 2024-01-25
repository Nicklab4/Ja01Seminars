package task20;

import java.util.PriorityQueue;

public class task20_PriorityQueueExample {
    public static void main(String[] args) {
        // Создаём приоритетную очередь с элементами типа Integer
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();

        // Добавляем элементы с учётом и х приоритета
        priorityQueue.add(5);
        System.out.println("Приоритетная очередь: " + priorityQueue);
        priorityQueue.add(3);
        System.out.println("Приоритетная очередь: " + priorityQueue);
        priorityQueue.add(8);
        System.out.println("Приоритетная очередь: " + priorityQueue);
        priorityQueue.add(1);
        System.out.println("Приоритетная очередь: " + priorityQueue);
        priorityQueue.add(6);
        System.out.println("Приоритетная очередь: " + priorityQueue);
        priorityQueue.add(9);
        System.out.println("Приоритетная очередь: " + priorityQueue);
        priorityQueue.add(7);
        System.out.println("Приоритетная очередь: " + priorityQueue);

        // Извлекаем элемент с наивысшим приоритетом без удаления
        int highestPriority = priorityQueue.peek();
        System.out.println("Наивысший приоритет: " + highestPriority);

        // Извлекаем и удаляем элемент с наивысшим приоритетом
        int removeHighestPriority = priorityQueue.poll();

        int nexPriority = priorityQueue.poll();

        System.out.println("Наивысший приоритет: " + removeHighestPriority);
        System.out.println("Следующий приоритет: " + nexPriority);
        System.out.println("Приоритетная очередь после извлечения: " + priorityQueue);
    }
}
