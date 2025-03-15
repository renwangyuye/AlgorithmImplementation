package part2;
import java.util.Arrays;
/*
 * 快排
 */
import java.util.Scanner;

public class p1177 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
        }
        
    private static void quickSort(int[] arr, int left, int right) {
        if (left >= right) return;
        int p = partition(arr, left, right);
        quickSort(arr, left, p - 1);
        quickSort(arr, p + 1, right);
    }
    private static int partition(int[] arr, int left, int right) {
        int p = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] < p) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;

    }
    private static void swap(int[] arr, int left, int right) {
        int t = arr[left];
        arr[left] = arr[right];
        arr[right] = t;
    }
}
