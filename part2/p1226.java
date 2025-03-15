package part2;
/*
 * 快速幂模板
 * 一般使用快速幂数字会增加非常大，过程中尽量使用大数据类型和算法
 */
import java.util.Scanner;

public class p1226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = sc.nextInt();
        sc.close();
        int s = 1, a1 = a, b1 = b;
        while (b1 > 0) {
            if ((b1 & 1) == 1) {  // 使用位运算代替取模
                s = (int)((1L * s * a1) % p);
            }
            a1 = (int)((1L * a1 * a1) % p);
            b1 >>= 1; // 右移代替除法
        }
        System.out.printf("%d^%d mod %d=%d%n", a, b, p, s);
    }
}
