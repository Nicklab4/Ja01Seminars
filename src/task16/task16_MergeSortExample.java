package task16;
import java.util.ArrayList;
import java.util.List;


public class task16_MergeSortExample {
    public static void main(String[] args) {
        List<Integer> unsortedList = new ArrayList<>();
        unsortedList.add(5);
        unsortedList.add(1);
        unsortedList.add(9);
        unsortedList.add(3);
        unsortedList.add(7);

        System.out.println("Неотсортированный список" + unsortedList);

        mergeSort(unsortedList);

        System.out.println("Отсортированный список" + unsortedList);
    }

    public static void mergeSort(List<Integer> list) {
        if (list.size()<=1) return;

        List<Integer> left = new ArrayList<>(list.subList( 0, list.size()/2));
//        System.out.println(Arrays.toString(a));
        List<Integer> right = new ArrayList<>(list.subList( list.size()/2, list.size()));
//        System.out.println(Arrays.toString(a));


        mergeSort(left);
        mergeSort(right);

        merge(list, left, right);
    }

    public static void merge(List<Integer> result, List<Integer> left, List<Integer> right) {
        int i = 0, j = 0, k = 0;
        //int[] c = new int[list.size()];
        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)){
                result.set(k, left.get(i));
                i++;
            }
            else{
                result.set(k, right.get(j));
                j++;
            }
            k++;
        }

        while (i < left.size()){
            result.set(k, left.get(i));
            i++;
            k++;
        }

        while (j < right.size()){
            result.set(k, right.get(j));
            j++;
            k++;
        }
    }
}
