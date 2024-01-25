package task22;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Task22_HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Анна", 25);
        ageMap.put("Иван", 30);
        ageMap.put("Мария", 28);

        // Проверяем наличие значения
        boolean hasAge30 = ageMap.containsValue(30);
        System.out.println("Есть ли значение '30'? " + hasAge30);


        // Получаем количество элементов
        int size = ageMap.size();
        System.out.println("Количество элементов в HashMap: " + size);

        // Проверяем, пуст ли HashMap
        boolean isEmpty = ageMap.isEmpty();
        System.out.println("HashMap пустой? " + isEmpty);

        // Получаем набор ключей
        Set<String> keys = ageMap.keySet();
        System.out.println("Набор ключей: " + keys);

        // Получаем коллекцию значений
        Collection<Integer> values = ageMap.values();
        System.out.println("Коллекция значений: " + values);



        // Получаем набор записей (ключ-значение)
        Set<Map.Entry<String, Integer>> entries = ageMap.entrySet();
        System.out.println("Набор записей: " + entries);

        // Очищаем HashMap
        ageMap.clear();
        System.out.println("HashMap после очистки: " + ageMap);

        ////////////////////////////////////////////////////////////////
        // Создаем другую HashMap
        HashMap<String, Integer> newAgeMap = new HashMap<>();
        newAgeMap.put("Иван", 30);
        newAgeMap.put("Мария", 28);

        // Добавляем все элементы из newAgeMap в ageMap
        ageMap.putAll(newAgeMap);
        System.out.println("HashMap после добавления элементов из другой карты: " + ageMap);

        // Заменяем возраст Ивана
        ageMap.replace("Иван", 32);
        System.out.println("Новый возраст Ивана: " + ageMap.get("Иван"));

    }
}