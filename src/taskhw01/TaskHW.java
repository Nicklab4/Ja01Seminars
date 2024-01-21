/*
Вычислить n-ое треугольного число(сумма чисел от 1 до n).

Внутри класса Answer напишите метод countNTriangle, который принимает
число n и возвращает его n-ое треугольное число.
Если число n < 1 (ненатуральное) метод должен вернуть -1.
*/

package taskhw01;

public class TaskHW {
}


class Answer {
    public int countNTriangle(int n){
        // Введите свое решение ниже
        if (n <=0) return -1;
        int temp = 0;
        for (int i = 1; i <= n; i++) {
            temp = temp + i;
        }
        return temp;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
