package part3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class p5194 {
    static int ans = 0;
    static int c;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        // 读取一行两个数据
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        c = Integer.parseInt(input[1]);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int zl = 0;
        backTrack(n, arr, zl, 0);
        out.println(ans);
        out.flush();
        out.close();
    }
    public static void backTrack(int n, int[] arr, int zl, int start) {
        if (zl > c) return;
        if (zl > ans) {
            ans = zl;
        }
        // 优化剪枝条件
        if (start >= n) return;
        if (zl + arr[start] > c) return;
        
        // 计算剩余砝码的总和
        int remainingSum = 0;
        for (int i = start; i < n; i++) {
            remainingSum += arr[i];
        }
        if (zl + remainingSum <= ans) return;

        for (int i = n - 1; i >= start; i--) {
            if (arr[i] + zl <= c) {
                zl += arr[i];
                backTrack(n, arr, zl, i + 1);
                zl -= arr[i];
            }
        }
    }
}
