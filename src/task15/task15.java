package task15;
import java.util.ArrayList;
import java.util.Arrays;
public class task15 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

        // Заменяем каждый элемент на его квадрат
        numbers.replaceAll(n -> n*n);
        System.out.println(numbers);
    }
}
