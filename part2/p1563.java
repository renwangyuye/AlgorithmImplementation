package part2;

import java.util.Scanner;

public class p1563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] narr0 = new int[n];
        String[] narr1 = new String[n];
        for (int i = 0; i < n; i++) {
            narr0[i] = sc.nextInt();
            narr1[i] = sc.next();
        }
        int[][] arr = new int[m][2];
        for (int i = 0; i < m; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int resIndex = 0;
        String res = "";
        for (int i = 0; i < m; i++) {
            if ((narr0[resIndex] == 0 && arr[i][0] == 0) || (narr0[resIndex] == 1 && arr[i][0] == 1)) {
                resIndex = (resIndex - arr[i][1] + n) % n;
            } else if ((narr0[resIndex] == 0 && arr[i][0] == 1) || (narr0[resIndex] == 1 && arr[i][0] == 0)) {
                resIndex = (resIndex + arr[i][1] + n) % n;
            }
        }
        res = narr1[resIndex];
        System.out.println(res);
        sc.close();
    }
}
