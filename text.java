import java.util.*;
import java.io.*;

public class text {
    static String res = "";
    static int count = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine().trim());
        char[][] visited = new char[n][n];
        for (char[] c : visited) {
            Arrays.fill(c, '.');
        }
        backTrack(n, 0, visited);
        out.print(res);
        out.println(count);
        out.flush();
        out.close();
    }
    public static void backTrack(int n, int row, char[][] visited) {
        if (row == n) {
            if (count < 3) {
                res += arrays2string(visited);
            }
            count++;
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isValid(row, col, n, visited)) {
                visited[row][col] = 'Q';
                backTrack(n, row + 1, visited);
                visited[row][col] = '.';
            } 
        }
    }
    public static boolean isValid(int row, int col, int n, char[][] visited) {
        // 检查列
        for (int i = 0; i < row; i++) {
            if (visited[i][col] == 'Q') {
                return false;
            }
        }
        // 检查45度
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j] == 'Q' && i + j == row + col) {
                    return false;
                }
            }
        }
        // 检查135度
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j] == 'Q' && row - col == i - j) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String arrays2string(char[][] visited) {
        String str = "";
        for (char[] c : visited) {
            for (int i = 0; i < c.length; i++) {
                if (c[i] == 'Q') {
                    str += (i + 1) + " ";
                }
            }
        }
        str.trim();
        str += "\n";
        return str;
    }
}
