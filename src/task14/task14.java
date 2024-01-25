package task14;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class task14{
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Апельсин");

        // Используем пользовательский метод Replace для замены элементов
        replace(fruits, "Банан", "Груша");

        // Используем стандартный метод set для замены элементов
        fruits.set(2, "Вишня");

        System.out.println("Список фруктов после замены: " + fruits);
    }

    // пользовательский метод replace для замены элемента в ArrayList
    public static <E> void replace(ArrayList<E> list, E oldElement, E newElement) {
        int index = list.indexOf(oldElement);
        if (index != -1) {
            list.set(index, newElement); // Используем стандартный элемент set для замены
        }
    }
}
