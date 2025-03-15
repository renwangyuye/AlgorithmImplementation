package rumen1;
/*
 * 苹果采购
 */
import java.util.Scanner;

public class P5703 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a * b;
        System.out.println(result);
        sc.close(); // 关闭 Scanner，防止资源泄露
    }
}
