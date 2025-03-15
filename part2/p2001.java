package part2;

import java.util.Scanner;

public class p2001 {
    static double a, b, c, d;  // 存储系数
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = sc.nextDouble();
        sc.close();

        double[] roots = new double[3]; // 存储三个根
        int rootIndex = 0;

        // 遍历 -100 到 100，找到符号变化的区间
        for (double i = -100; i < 100; i += 0.1) {  // 加密搜索范围，提高精度
            double x1 = i, x2 = i + 0.1;
            double f1 = f(x1), f2 = f(x2);

            if (f1 * f2 <= 0) {  // 说明 (x1, x2) 内存在根（f1 或 f2 可能恰为 0）
                roots[rootIndex++] = binarySearch(x1, x2);
                if (rootIndex == 3) break;  // 找到 3 个根就可以退出
            }
        }

        // 输出结果（保留两位小数）
        for (double n : roots) {
            System.out.printf("%.2f ", n);
        }
    }

    // 计算 f(x) = ax^3 + bx^2 + cx + d
    private static double f(double x) {
        return a * x * x * x + b * x * x + c * x + d;
    }

    // 二分法求解零点
    public static double binarySearch(double l, double r) {
        while (Math.abs(r - l) > 1e-7) {  // 误差设小一点，避免跳过根
            double mid = (l + r) / 2.0;
            if (Math.abs(f(mid)) < 1e-7) return mid;  // 若 f(mid) ≈ 0，直接返回

            if (f(l) * f(mid) < 0) {  // 根在 (l, mid)
                r = mid;
            } else {  // 根在 (mid, r)
                l = mid;
            }
        }
        return (l + r) / 2;  // 返回二分法求得的近似零点
    }
}
