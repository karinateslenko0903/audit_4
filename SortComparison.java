import java.util.Arrays;

public class SortComparison {
    public static void main(String[] args) {
        int[] array1 = generateRandomArray(1000);
        int[] array2 = Arrays.copyOf(array1, array1.length);
        int[] array3 = Arrays.copyOf(array1, array1.length);

        long startTime = System.nanoTime();
        selectionSort(array1);
        long endTime = System.nanoTime();
        System.out.println("Selection Sort: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        countingSort(array2);
        endTime = System.nanoTime();
        System.out.println("Counting Sort: " + (endTime - startTime) + " ns");
    }

    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        return array;
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void countingSort(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }

        int[] count = new int[max + 1];
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }

        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                array[index++] = i;
                count[i]--;
            }
        }
    }
}
