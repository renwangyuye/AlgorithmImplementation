package part2;

import java.util.Scanner;

public class p1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][4];
        int[] xy = new int[2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
            arr[i][3] = sc.nextInt();
        }
        xy[0] = sc.nextInt();
        xy[1] = sc.nextInt();

        int res = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i][0] <= xy[0] && arr[i][0] + arr[i][2] >= xy[0] && arr[i][1] <= xy[1] && arr[i][1] + arr[i][3] >= xy[1]) {
                res = i + 1;
            }
        }
        System.out.println(res);
        sc.close();
    }
}
