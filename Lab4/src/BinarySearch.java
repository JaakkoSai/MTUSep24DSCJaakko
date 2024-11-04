public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        return binarySearchHelper(array, target, 0, array.length - 1);
    }

    private static int binarySearchHelper(int[] array, int target, int low, int high) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (array[mid] == target) return mid;
        else if (array[mid] > target) return binarySearchHelper(array, target, low, mid - 1);
        else return binarySearchHelper(array, target, mid + 1, high);
    }
}