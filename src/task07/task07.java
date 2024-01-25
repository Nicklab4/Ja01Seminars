package task07;

import java.io.File;
import java.io.IOException;

public class task07 {
    public static void main(String[] args) {
        try {
            // Создаём объект файла
            File file = new File("example.txt");

            // Проверяем существование файла
            if (!file.exists()) {
                // Создаем новый файл если он не существует
                file.createNewFile();
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exist");
            }

            // Получаем и выводи путь к файлу
            System.out.println("File path: " + file.getPath());

            // Получаем и выводи имя файла
            System.out.println("File name: " + file.getName());

            // Получаем и выводи расширение файла
            System.out.println("File extension: " + file.getName().substring(file.getName().lastIndexOf(".") + 1));

            // Получаем и выводи длину файла
            System.out.println("File length: " + file.length());

            // Получаем и выводи дата создания файла
            System.out.println("File creation date: " + file.lastModified());

            // Получаем и выводи дата последнего изменения файла
            System.out.println("File last modified date: " + file.lastModified());

//            // Удаляем файл
//            file.delete();
//            System.out.println("File deleted");
        }

        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
