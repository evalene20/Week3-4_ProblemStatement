import java.util.*;

public class Problem5 {

    static int linearSearch(String[] arr, String target) {
        int comparisons = 0;
        for (int i = 0; i < arr.length; i++) {
            comparisons++;
            if (arr[i].equals(target)) {
                System.out.println("Linear Found at: " + i + " Comparisons: " + comparisons);
                return i;
            }
        }
        return -1;
    }

    static void binarySearch(String[] arr, String target) {
        int low = 0, high = arr.length - 1, comparisons = 0;

        while (low <= high) {
            comparisons++;
            int mid = (low + high) / 2;

            if (arr[mid].equals(target)) {
                System.out.println("Binary Found at: " + mid + " Comparisons: " + comparisons);
                return;
            } else if (arr[mid].compareTo(target) < 0) {
                low = mid + 1;
            } else high = mid - 1;
        }
    }

    public static void main(String[] args) {
        String[] arr = {"accA", "accB", "accB", "accC"};
        Arrays.sort(arr);

        linearSearch(arr, "accB");
        binarySearch(arr, "accB");
    }
}