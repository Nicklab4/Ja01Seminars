package task13;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task13{
    public static void main(String[] args) {
        // Создаём ArrayList для хранения чисел
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

        // Создаём коллекцию для удаления элементов
        List<Integer> toRemove = Arrays.asList(2, 4, 6);

        // Удаляем из списка все элементы которые содержатся в коллекции toRemove
        numbers.removeAll(toRemove);
        System.out.println("Список после удаления элементов: " + numbers);


        ArrayList<Integer> numbers2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

        // Создаём коллекцию с элементами которые хотим оставить
        List<Integer> toRetain = Arrays.asList(2, 4, 6);
        // Оставляем в списке только те элементы которые содержатся в коллекции ToRetain
        numbers2.retainAll(toRetain);

        System.out.println("Список после оставления элементов: " + numbers2);
    }
}
