package part2;

import java.util.Scanner;

public class p1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] sarr = s.toCharArray();
        int A = 0, B = 0;
        for (char c : sarr) {
            if (c == 'E') {
                System.out.println(A + ":" + B); // 在退出前打印当前比分
                break;
            }
            if (c == 'W') A++;
            if (c == 'L') B++;
            if (Math.max(A, B) >= 11 && Math.abs(A - B) >= 2) {
                System.out.println(String.valueOf(A) + ':' + B);
                A = 0;
                B = 0;
            }
        }
        System.out.println();
        A = 0; B = 0;
        for (char c : sarr) {
            if (c == 'E') {
                System.out.println(A + ":" + B); // 在退出前打印当前比分
                break;
            }
            if (c == 'W') A++;
            if (c == 'L') B++;
            if ((A >= 11 || B >= 11) && Math.abs(A - B) >= 2) {
                System.out.println(String.valueOf(A) + ':' + B);
                A = 0;
                B = 0;
            }
        }
        sc.close();
    }
}
