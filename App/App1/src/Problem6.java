import java.util.*;

public class Problem6 {

    static int floor(int[] arr, int target) {
        int res = -1;
        for (int x : arr) {
            if (x <= target) res = x;
        }
        return res;
    }

    static int ceiling(int[] arr, int target) {
        for (int x : arr) {
            if (x >= target) return x;
        }
        return -1;
    }

    static void binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                System.out.println("Found at index " + mid);
                return;
            } else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }

        System.out.println("Not found");
    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 50, 100};

        binarySearch(arr, 30);

        System.out.println("Floor: " + floor(arr, 30));
        System.out.println("Ceiling: " + ceiling(arr, 30));
    }
}