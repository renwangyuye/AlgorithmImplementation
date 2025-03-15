package part2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class p2009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt(); // 编号
            arr[i][1] = sc.nextInt(); // 分数
        }

        // **按照分数降序排序**，如果分数相同，则按编号升序排序
        Arrays.sort(arr, (a, b) -> b[1] != a[1] ? Integer.compare(b[1], a[1]) : Integer.compare(a[0], b[0]));

        // 计算分数线，至少选择 `m * 1.5` 人
        int index = (int) Math.floor(m * 1.5) - 1;
        int scoreLine = arr[index][1];

        // 统计符合要求的人数
        int count = 0;
        for (int[] student : arr) {
            if (student[1] >= scoreLine) {
                count++;
            }
        }

        // 输出分数线和最终人数
        System.out.println(scoreLine + " " + count);

        // 输出符合要求的考生（已经排序，无需再处理）
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

        sc.close();
    }
}
