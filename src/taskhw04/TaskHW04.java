// Дана строка sql-запроса:
// select * from students where "

// Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные (параметры)
// для фильтрации приведены в виде json-строки в примере ниже. Если значение null, то
// параметр не должен попадать в запрос.
//
// Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два
// параметра:
// String QUERY - начало SQL-запроса String PARAMS - JSON с параметрами
//
// Пример: Строка sql-запроса:
//
// select * from students where
// Параметры для фильтрации:
//        {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//
// Результат:
// select * from students where name='Ivanov' and country='Russia' and city='Moscow'

package taskhw04;

import java.util.List;

class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS) {
        // Напишите свое решение ниже
        StringBuilder sb = new StringBuilder();
        sb.append(QUERY);

        PARAMS = PARAMS.replace("{", "");
        PARAMS = PARAMS.replace("}", "");
        PARAMS = PARAMS.replace("\"", "");
        String[] pr = PARAMS.split(",");
        List<String> list = new java.util.ArrayList<String>();
        for (int i = 0; i < pr.length; i++) {
            String[] pr1 = pr[i].split(":");
            list.add(pr1[0].trim());
            list.add(pr1[1].trim());
        }

        for (int i = 0; i < list.size(); i += 2) {
            if (list.get(i + 1).equals("null"))
                continue;
            else {
                if (i > 0)
                    sb.append(" and ");
                sb.append(list.get(i) + "='" + list.get(i + 1) + "'");
            }
        }

        return sb;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class TaskHW04 {
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        }
        else{
            QUERY = args[0];
            PARAMS = args[1];
        }

        Answer ans = new Answer();
        System.out.println(ans.answer(QUERY, PARAMS));
    }
}