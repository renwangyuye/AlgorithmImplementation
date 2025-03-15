package part2;

import java.util.Scanner;

public class p1998 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(decompose(n));

    }
    public static String decompose(int n) {
        if (n == 0) return "0";
        if (n == 1) return "2(0)";

        StringBuilder result = new StringBuilder();
        boolean first = true;

        for (int i = 15; i >= 0; i--) {
            if ((n & (1 << i)) != 0) {
                if (!first) result.append("+");
                first = false;
            

                if (i == 1) {
                    result.append("2");
                } else if (i == 0) {
                    result.append("2(0)");
                } else {
                    result.append("2(").append(decompose(i)).append(")");
                }
            }
        }
        return result.toString();
    }
}
