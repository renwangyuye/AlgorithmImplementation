package part2;

import java.util.Scanner;

public class p1908 {
    static int[] temp ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        temp = new int[n];
        long ans= mergeSort(arr, 0, n - 1);
        System.out.println(ans);
    }
    public static long mergeSort(int[] arr, int left, int right) {
        if (left == right) return 0;
        int mid = left + (right - left) / 2;
        return mergeSort(arr, left, mid) + mergeSort(arr, mid + 1, right) + merge(arr, left, mid, right);
    }
    
    public static long merge(int[] arr, int left, int mid, int right) {
        long ans = 0;
        for (int i = left, j = mid + 1; i <= mid; i++) {
            while (j <= right && arr[i] > arr[j]) {
                j++;
            }
            ans += j - mid - 1;
        }
        int i = left, a = left, b = mid + 1;
        while (a <= mid && b <= right) {
            temp[i++] = arr[a] <= arr[b] ? arr[a++] : arr[b++]; 
        }
        while (a <= mid) {
            temp[i++] = arr[a++];
        }
        while (b <= right) {
            temp[i++] = arr[b++];
        }
        for (int j = left; j <= right; j++) {
            arr[j] = temp[j];
        }
        return ans;
    }
}
