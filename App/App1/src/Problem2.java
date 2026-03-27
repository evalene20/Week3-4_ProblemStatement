import java.util.*;

class Client {
    String name;
    int riskScore;

    Client(String name, int riskScore) {
        this.name = name;
        this.riskScore = riskScore;
    }

    public String toString() {
        return name + ":" + riskScore;
    }
}

public class Problem2 {

    static void bubbleSort(Client[] arr) {
        int swaps = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].riskScore > arr[j + 1].riskScore) {
                    Client temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }
        System.out.println("Bubble: " + Arrays.toString(arr));
        System.out.println("Swaps: " + swaps);
    }

    static void insertionSort(Client[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Client key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].riskScore < key.riskScore) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println("Insertion DESC: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Client[] arr = {
                new Client("C", 80),
                new Client("A", 20),
                new Client("B", 50)
        };

        bubbleSort(arr.clone());
        insertionSort(arr);

        System.out.println("Top Risks:");
        for (Client c : arr) {
            System.out.println(c);
        }
    }
}