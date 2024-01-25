package task12;
import java.util.ArrayList;
import java.util.List;

public class task12 {
    public static void main(String[] args) {
        // Создаем ArrayList для хранения строк
        ArrayList<String> fruits = new ArrayList<>();

        ArrayList<String> additionalFruits = new ArrayList<>();

        // Добавляем элементы в конец списка
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Апельсин");

        // Добавляем элементы во второй список
        additionalFruits.add("Груша");
        additionalFruits.add("Вишня");

        // Добавляем второй список в первый
        fruits.addAll(additionalFruits);

        // выводим список
        System.out.println("Список после добавления элементов:" + fruits);

        // Добавляем новый элемент в конец списка
        fruits.add("Груша");
        fruits.add(1, "apple");

        // Выводим обновленный список
        System.out.println("Список после добавления нового элемента" + fruits);

        // Проверяем, содержит ли список определённые элементы.
        boolean containsBanana = fruits.contains("Банан");
        boolean containsPech = fruits.contains("Персик");
        System.out.println("Список содержит Банан: " + containsBanana);
        System.out.println("Список содержит Персик: " + containsPech);

        // Получаем элемент по индексу
        String secondFruit = fruits.get(1);
        System.out.println("Второй элемент списка: " + secondFruit);

        // Находим индекс первого вхождения Банан в списке
        fruits.add("Банан");
        int indexOfBanana = fruits.indexOf("Банан");
        System.out.println("Индекс первого вхождения Банан: " + indexOfBanana);

        // Удаляем первое вхождение Банан
        fruits.remove("Банан");
        // Находим и выводим индекс банана
        indexOfBanana = fruits.indexOf("Банан");
        System.out.println("Индекс первого вхождения Банан после удаления: " + indexOfBanana);

        // Изменяем элемент по индексу
        System.out.println("Список до замены: " + fruits);
        fruits.set(1, "Маракуйя");
        System.out.println("Список после замены: " + fruits);

        //размер списка
        int size = fruits.size();
        System.out.println("Размер списка: " + size);

        // Создаём отдельный список начиная с индекса 1 и до индекса 5
        List<String> subList = fruits.subList(1, 5);
        System.out.println("отдельный список элементов с 1 по 5" + subList);

        // Преобразуем список в массив
        String[] fruitsArray = fruits.toArray(new String[fruits.size()]);
        // Выводим массив
        for (String fruit : fruitsArray){
            System.out.println(fruit);
        }

        // Получаем строковое представление списка
        String fruitsString = fruits.toString();
        System.out.println("Строковое представление списка: " + fruitsString);

        // Очистка списка
        fruits.clear();
        System.out.println("Список после удаления" + fruits);

        // Проверяем, пуст ли список
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Список пустой: " + isEmpty);
    }
}
