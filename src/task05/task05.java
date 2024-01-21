package task05;

public class task05{
    public static void main(String[] args) {
        String greeting = "Hello World!";

        // Конкатенация строки
        String name = "Java";
        String message = greeting + " Добро пожаловать " + name + "!";

        // Выводим исходную и новую строку
        System.out.println("original string: " + greeting);
        System.out.println("Concatenated string: " + message);

        // Демонстрация неизменяемости строки
        //greeting = greeting.toUpperCase();
        System.out.println("Upper: " + greeting.toUpperCase());
        System.out.println("Original: " + greeting);

        String s1 = "Hello World!"; // создание строки литералом
        String s2 = new String("hello world!"); // создание строки с помощью конструктора

        int length = s1.length(); // Возврат длинны строки
        System.out.println("length: " + length);

        boolean isEquals = s1.equals(s2); // false регистр букв разный
        System.out.println("isEquals: " + isEquals);
        boolean isEqualsIgnoreCase = s1.equalsIgnoreCase(s2); // true игнорируем регистр букв
        System.out.println("isEqualsIgnoreCase: " + isEqualsIgnoreCase);

        // Поиск в строке
        int index = s1.indexOf('o'); // возвращает индекс первого вхождения слова "р"индекс первого вхождения слова "привет" в строке с индексом 2 и длинны строки 4
        System.out.println("index: " + index);

        // Возврат части строки
        String substring = s1.substring(6, 11); // возвращает часть строки с индексом 2 и длинны строки 4
        System.out.println("substring: " + substring);

        // Замена части строки
        s1 = s1.replace("World", "Java"); // замена слова "привет" на "привет мир"
        System.out.println("Replace: " + s1);

        // Удаление начальных и конечных пробелов
        s1 = "  New World " ;
        s1 = s1.trim(); // удаляет начальные и конечные пробелы
        System.out.println("Trim: " + s1);

        // форматирование строки
        String name2 = "Java";
        int version = 10;
        System.out.println(String.format("Language: %s, Version: %d", name2, version));

        //Проверка является ли строку пустой
        String emptyString = "";
        boolean isEmpty = emptyString.isEmpty();
        System.out.println("isEmpty: " + isEmpty);

    }
}
