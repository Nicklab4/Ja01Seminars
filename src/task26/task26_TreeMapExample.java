package task26;

import java.util.TreeMap;

public class task26_TreeMapExample {
    public static void main(String[] args) {
        // Создаем TreeMap для хранения имен и их возрастов
        TreeMap<String, Integer> ageMap = new TreeMap<>();

        // Добавляем элементы в TreeMap
        ageMap.put("Анна", 25);
        ageMap.put("Иван", 30);
        ageMap.put("Мария", 28);
        ageMap.put("Олег", 26);

        // Получаем элементы в упорядоченном порядке по ключам
        System.out.println("Возраст Анны: " + ageMap.get("Анна"));
        System.out.println("Первый элемент: " + ageMap.firstEntry());
        System.out.println("Последний элемент: " + ageMap.lastEntry());

        // Удаляем элемент по имени
        ageMap.remove("Иван");
        System.out.println("TreeMap после удаления: " + ageMap);

        // Проверяем наличие ключа
        boolean hasAnna = ageMap.containsKey("Анна");
        System.out.println("Есть ли ключ 'Анна'? " + hasAnna);

        // Получаем количество элементов
        int size = ageMap.size();
        System.out.println("Количество элементов в TreeMap: " + size);


        // Получаем наибольший ключ, меньший или равный "Константин"
        String floorKey = ageMap.floorKey("Константин");
        System.out.println("Наибольший ключ, меньший или равный 'Константин': " + floorKey);



        // Получаем наименьший ключ, больший или равный "Константин"
        String ceilingKey = ageMap.ceilingKey("Константин");
        System.out.println("Наименьший ключ, больший или равный 'Константин': " + ceilingKey);



        // Получаем наименьший ключ, строго больший "Мария"
        String higherKey = ageMap.higherKey("Мария");
        System.out.println("Наименьший ключ, строго больший 'Мария': " + higherKey);



        // Получаем наибольший ключ, строго меньший "Мария"
        String lowerKey = ageMap.lowerKey("Мария");
        System.out.println("Наибольший ключ, строго меньший 'Мария': " + lowerKey);

    }
}