package part2;

import java.util.Arrays;
import java.util.Scanner;

public class p4995 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int left = 0;
        int right = n - 1;
        int ans = 0;
        boolean flag = true;
        while (left <= right) {
            int h = arr[right] - arr[left];
            ans += h * h;
            if (flag) {
                left++;
            } else {
                right--;
            }
            flag = !flag;
        }
        ans += arr[n - 1] * arr[n - 1];
        System.out.println(ans);
    }
}
