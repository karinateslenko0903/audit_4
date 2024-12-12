public class BinarySearchTailRecursive {
    public static int binarySearch(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (array[mid] == target) {
            return mid;
        } else if (array[mid] < target) {
            return binarySearch(array, target, mid + 1, right);
        } else {
            return binarySearch(array, target, left, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(array, 5, 0, array.length - 1)); // Output: 4
    }
}
