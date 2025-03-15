package part2;

import java.util.Scanner;

public class p1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        String res = "";
        for (int i = 0; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int n2 = n;
        for (int i = 0; i <= n; i++, n2--) {
            if (i != 0 && arr[i] > 0) {
                res += "+";
            }
            if (arr[i] == 0) continue;
            if (i == n) {
                res += arr[i];
            } else if (i == n - 1 && arr[i] == 1) {
                res += "x";
            } else if (i == n - 1) {
                res += arr[i] + "x";
            } else if (arr[i] == 1) {
                res += "x^" + n2;
            } else if (arr[i] == -1) {
                res += "-x^" + n2;
            } else {
                res += arr[i] + "x^" + n2;
            }
        }
        System.out.println(res);
        sc.close();
    }
}
