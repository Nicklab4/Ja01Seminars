// Внутри класса MergeSort напишите метод mergeSort, который принимает массив
// целых чисел, реализует алгоритм сортировки слиянием. Метод должен возвращать
// отсортированный массив.
//
// Пример
// a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]


package taskhw06;
import java.util.Arrays;



class MergeSort {
    public static int[] mergeSort(int[] a) {
        // Напишите свое решение ниже
        if (a.length == 0 | a.length == 1)
            return a;

        int[] l = mergeSort(Arrays.copyOfRange(a, 0, a.length/2));
//        System.out.println(Arrays.toString(a));
        int[] r = mergeSort(Arrays.copyOfRange(a, a.length/2, a.length));
//        System.out.println(Arrays.toString(a));
        int n = 0, m = 0, k = 0;
        int[] c = new int[a.length];
        while (n < l.length & m < r.length) {
            if (l[n] <= r[m]){
                c[k] = l[n];
                n++;
            }
            else{
                c[k] = r[m];
                m++;
            }
            k++;
        }

        while (n < l.length){
            c[k] = l[n];
            n++;
            k++;
        }

        while (m < r.length){
            c[k] = r[m];
            m++;
            k++;
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = c[i];
        }

        return a;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class taskhw06{
    public static void main(String[] args) {
        int[] a;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{7, 5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}