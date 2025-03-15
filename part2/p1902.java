package part2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p1902 {
    static int n, m;
    static int[][] arr;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            m = sc.nextInt();
            arr = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int left = 0, right = 1000, ans = 0;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (can(mid)) {
                    ans = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            System.out.println(ans);
            sc.close();
        }
        public static boolean can(int maxx) {
            Queue<int[]> queue = new LinkedList<>();
            boolean[][] visited = new boolean[n][m];
    
            for (int i = 0; i < m; i++) {
                queue.offer(new int[]{0, i});
                visited[0][i] = true;
            }
    
            while (!queue.isEmpty()) {
                int[] cur = queue.poll();
                int x = cur[0], y = cur[1];
    
                if (x == n - 1) {
                    return true;
                }
    
                for (int i = 0; i < 4; i++) {
                    int nx = x + dx[i], ny = y + dy[i];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] <= maxx && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.offer(new int[]{nx, ny});
                    }
                }
            }
            return false;
    }
}
