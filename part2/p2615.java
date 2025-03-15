package part2;

import java.util.Scanner;

public class p2615 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;
        int[][] arr = new int[n][n];
        int x = 0;
        int y = n / 2; 
        while (k <= n * n) {
            arr[x][y] = k;
            if (x == 0 && y != n - 1) {
                x = n - 1;
                y++;
            } else if (x != 0 && y == n - 1) {
                x--;
                y = 0;
            } else if (x == 0 && y == n - 1) {
                x++;
            } else if (x != 0 && y != n - 1) {
                if (arr[x - 1][y + 1] == 0) {
                    x--;
                    y++;
                } else {
                    x++;
                }
            }
            k++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
