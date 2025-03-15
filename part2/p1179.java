package part2;

import java.util.Scanner;

public class p1179 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int count = 0;
        for (int i = l; i <= r; i++) {
            int t = i;
            while (t > 0) {
                int n = t % 10;
                if (n == 2) {
                    count++;
                }
                t /= 10;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
