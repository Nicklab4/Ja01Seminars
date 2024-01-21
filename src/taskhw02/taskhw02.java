//Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке.
//
//Напишите свой код в методе printPrimeNums класса Answer.
//


package taskhw02;
class Answer {
    public void printPrimeNums(){
        // Напишите свое решение ниже

        for (int i = 2; i <= 1000; i++) {
            int isPrime = 0;
            for (int j = 2 ; j <= i; j++)
                if (i % j == 0){
                    isPrime++;
                    if (isPrime > 1) break;
                }
            if (isPrime == 1 ) {
                System.out.println(i);
            }
        }

    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class taskhw02{
    public static void main(String[] args) {

        Answer ans = new Answer();
        ans.printPrimeNums();
    }
}