package part2;

import java.util.Scanner;

public class p2015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 2];
        arr[0] = 0;
        arr[ n + 1] = l;
        for (int i = 1; i < n + 1; i++) {
            arr[i] = sc.nextInt();
        }
        int left = 1, right = l, ans = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (canJump(arr, n, m, mid)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(ans);
        sc.close();
    }
    private static boolean canJump(int[] arr, int n, int m, int d) {
        int cur = 0;
        int count = 0;
        for (int i = 1; i <= n + 1; i++) {
            if (arr[i] - cur < d) {
                count++;
                if (count > m) return false;
            } else {
                cur = arr[i];
            }
        }
        return true;
    }
}
