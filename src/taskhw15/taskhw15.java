// Задание
//
// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными
// телефонами, их необходимо считать, как одного человека с разными телефонами. Вывод должен быть
// отсортирован по убыванию числа телефонов.


// Фактически, данная задача уже была решена в ходе автотестов к семинару №5.
// Основное отличие заключается в том, что для записи реальных 11 значных телефонов тип Integer -
// не очень-то и подходит.
// Поэтому была произведена замена на тип Long.
//
// В конечном итоге, основные изменения касаются метода getPhoneBook - отвечающего за вывод
// телефонной книги в формате подразумевающим сортировку по числу телефонов. Судя по условию,
// сперва должны идти имена имеющие большее количество телефонов, затем - меньшее.

// итоговый вывод:
//
// Andrew: [89221234567, 89651234567, 89651333567]
// Alex: [89131234567, 89221555567]
// Igor: [89221200555]
// Nick: [89221234555]
//
// Process finished with exit code 0


package taskhw15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class PhoneBook {
    private static HashMap<String, ArrayList<Long>> phoneBook = new HashMap<>();

    public void add(String name, Long phoneNum) {
        ArrayList<Long> values  = new ArrayList<>();

        if (phoneBook.containsKey(name)) {
            values = phoneBook.get(name);
        }

        values.add(phoneNum);
        phoneBook.put(name, values);
    }

    public ArrayList<Long> find(String name) {
        ArrayList<Long> values  = new ArrayList<>();

        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        }
        return values;
    }

    public static void getPhoneBook() {
        // Введите свое решение ниже
        //return phoneBook;

        List<Map.Entry<String, ArrayList<Long>>> entries = new ArrayList<>(phoneBook.entrySet());

        entries.sort((entry1, entry2) -> Long.compare(entry2.getValue().size(), entry1.getValue().size()));

        for (Map.Entry<String, ArrayList<Long>> entry : entries) {
            String name = entry.getKey();
            List<Long> phoneNumbers = entry.getValue();
            System.out.println(name + ": " + phoneNumbers);
        }
    }
}


public class taskhw15 {
    public static void main(String[] args) {
        PhoneBook myPhoneBook = new PhoneBook();

        myPhoneBook.add("Andrew", 89221234567L);
        myPhoneBook.add("Nick", 89221234555L);
        myPhoneBook.add("Alex", 89131234567L);
        myPhoneBook.add("Alex", 89221555567L);
        myPhoneBook.add("Andrew", 89651234567L);
        myPhoneBook.add("Andrew", 89651333567L);
        myPhoneBook.add("Igor", 89221200555L);

        //System.out.println(myPhoneBook.find("Alex"));
        //System.out.println(myPhoneBook.find("Me"));

        PhoneBook.getPhoneBook();
    }
}
