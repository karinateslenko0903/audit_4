public class CountingSort {
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

    public static void main(String[] args) {
        int[] array = {4, 2, 2, 8, 3, 3, 1};
        countingSort(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
