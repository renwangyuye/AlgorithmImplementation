package part2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class p1208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][2];
        for (int i = 0; i< m; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int need = n;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (need < arr[i][1]) {
                count += arr[i][0] * need;
                break;
            } else {
                need -= arr[i][1];
                count += arr[i][0] * arr[i][1];
            }
        }
        System.out.println(count);
    }
}
