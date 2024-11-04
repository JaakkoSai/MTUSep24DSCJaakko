public class MyArrays {
    public static int sum(int[] values) {
        return sumHelper(values, values.length - 1);
    }

    private static int sumHelper(int[] values, int index) {
        if (index < 0) return 0;
        return values[index] + sumHelper(values, index - 1);
    }
}