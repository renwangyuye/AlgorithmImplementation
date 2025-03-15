package part2;

import java.util.Scanner;

public class p1429 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        double minn = Double.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                double r = count(arr[i][0], arr[i][1], arr[j][0], arr[j][1]);
                if (r < minn) {
                    minn = r;
                }
            }
        }
        System.out.printf("%.4f\n", minn);
        sc.close();
    }
    private static double count(int x1, int y1, int x2, int y2) {
        if (x1 == x2) return y2 - y1;
        if (y1 == y2) return x2 - x1;
        double y = y2 - y1;
        double x = x2 - x1;
        return Math.sqrt(y * y + x * x);
    }
}
