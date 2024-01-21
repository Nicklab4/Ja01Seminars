package task03;

public class task03 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};

        System.out.println("Минимальное занчние: " + findMin(array));
        System.out.println("Максимальное занчение: " + findMax(array));
        printArray(array);
        reverseArray(array);
        System.out.println("Перевёрнутый массив: ");
        printArray(array);
    }

    private static void reverseArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private static int findMax(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
