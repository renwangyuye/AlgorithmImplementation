package rumen1;
/*
 * 字母转换
 */
import java.util.Scanner;

public class P5704 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char i = sc.next().charAt(0); // 取输入的第一个字符

        char I = Character.toUpperCase(i); // 转换大写

        System.out.println(I);
        sc.close();
    }
}
