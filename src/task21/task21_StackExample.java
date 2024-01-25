package task21;

import java.util.Stack;

public class task21_StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Элемент 1");
        stack.push("Элемент 2");
        stack.push("Элемент 3");

        // Извлечение и удаление элементов с вершины
        String topElement = stack.pop();
        String nextTopElement = stack.pop();

        System.out.println("Вершина стека: " + topElement);
        System.out.println("Следующая вершина стека: " + nextTopElement);


        stack.push("Элемент 1");
        stack.push("Элемент 2");
        stack.push("Элемент 3");

        // Получение элемента с вершины без удаления
        String peekElement = stack.peek();
        System.out.println("Вершина стека: " + peekElement);

        boolean isEmpty = stack.empty();
        System.out.println("Стек пустой?: " + isEmpty);

    }
}
