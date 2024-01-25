package task25;


import java.util.LinkedHashMap;
import java.util.Map;

public class task25_LinkedHashMapExample5 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("one", 1);
        linkedHashMap.put("two", 2);
        linkedHashMap.put("three", 3);

        // Итерирование элементов в порядке добавления с использованием entrySet()
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        for (Integer value : linkedHashMap.values()) {
            System.out.println(value);
        }

        for (String key : linkedHashMap.keySet()) {
            System.out.println(key);
        }


        // Итерирование элементов в LinkedHashMap
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Ключ: " + key + ", Значение: " + value);
        }
    }
}