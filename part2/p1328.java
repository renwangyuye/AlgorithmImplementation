package part2;

import java.util.Scanner;

public class p1328 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int na = sc.nextInt();
        int nb = sc.nextInt();
        int[] arra = new int[na];
        int[] arrb = new int[nb];
        for (int i = 0; i < na; i++) {
            arra[i] = sc.nextInt();
        }
        for (int i = 0; i < nb; i++) {
            arrb[i] = sc.nextInt();
        }
        int a = 0;
        int b = 0;
        int[][] map = {{0, 0, 1, 1, 0},{1, 0, 0, 1, 0},{0, 1, 0, 0, 1},{0, 0, 1, 0, 1},{1, 1, 0, 0, 0}}; 
        for (int i = 0; i < n; i++) {
            int aa = arra[i % na];
            int bb = arrb[i % nb];
            a += map[aa][bb];
            b += map[bb][aa];
        }
        System.out.print(a + " ");
        System.out.print(b);
        sc.close();
    }
}
