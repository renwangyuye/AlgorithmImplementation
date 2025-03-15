package part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p1094 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

		// 读取 w 和 g（支持 w 和 g 分行输入）
        int w = Integer.parseInt(br.readLine().trim());  
        int g = Integer.parseInt(br.readLine().trim());

		int[] arr = new int[g];
		for (int i = 0; i < g; i++) {
			arr[i] = Integer.parseInt(br.readLine().trim());
		}
		Arrays.sort(arr);
		int j = 0;
		int count = 0;
		for (int i = arr.length - 1; i >= j; i--) {
			if (arr[i] + arr[j] <= w) {
				j++;
			}
			count++;
		}
		out.println(count);
        out.flush();
        out.close();
	}
}
