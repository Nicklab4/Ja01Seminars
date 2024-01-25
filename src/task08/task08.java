package task08;

import java.io.FileInputStream;
import java.io.IOException;

public class task08{
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("example.txt");

            int i ;
            while ((i = fis.read()) != -1) {
                // Читаем и выводим файл по одному байту
                System.out.print((char)i);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
