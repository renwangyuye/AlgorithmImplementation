package rumen1;

import java.util.Scanner;

public class P5705 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        String numstr = String.valueOf(num); // 转换为字符串

        int point = numstr.indexOf('.'); // 找到指定字符的索引

        String integerPart = numstr.substring(0, point); // 切割字符串
        String decimalPart = numstr.substring(point + 1);
        
        String integer = new StringBuilder(integerPart).reverse().toString(); // 反转字符串
        String decimal = new StringBuilder(decimalPart).reverse().toString();

        double res = Double.parseDouble(decimal + '.' + integer); // 解析字符串为double类型
        System.out.println(res);
        sc.close();
    }
}

