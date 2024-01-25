package task09;

import java.io.FileOutputStream;
import java.io.IOException;

public class Task09 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("example.txt");

            // Строка для записи
            String str = "Hello World!";

            // Преобразуем строку в массив байтов и записываем их в файл
            //System.out.println(str.getBytes());
            fos.write(str.getBytes());
            fos.close();

            System.out.println("Файл успешно записан!");
        }

        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
