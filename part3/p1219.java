package part3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p1219 {

    static String res = "";
    static int count = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine().trim());
        char[][] visited = new char[n][n];
        for (char[] c : visited) {
            Arrays.fill(c, '.');
        }
        backTrack(n, 0, visited);;

        out.print(res);
        out.println(count);
        out.flush();
        out.close();
    }
    public static void backTrack(int n, int row, char[][] chessboard) {
        if (row == n) {
            if (count < 3) {
                res += Array2List(chessboard);
            }
            count++;
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isValid(row, col, n, chessboard)) {
                chessboard[row][col] = 'Q';
                backTrack(n, row + 1, chessboard);
                chessboard[row][col] = '.';
            }
        }
    }

    public static boolean isValid(int row, int col, int n, char[][] chessboard) {
        // 检查列
        for (int i = 0; i < row; i++) {
            if (chessboard[i][col] == 'Q') {
                return false;
            }
        }
        // 检查45度
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < n; j++) {
                if (chessboard[i][j] == 'Q' && i + j == row + col) {
                    return false;
                }
            }
        }
        // 检查135度
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < n; j++) {
                if (chessboard[i][j] == 'Q' && row - col == i - j) {
                    return false;
                }
            }
        }
        return true;
    }
    private static String Array2List(char[][] chessboard) {
        String list = "";
        for (char[] c : chessboard) {
            for (int i = 0; i < c.length; i++) {
                if (c[i] == 'Q') {
                    list += (i + 1) + " ";
                }
            }
        }
        list.trim();
        list += "\n";
        return list;
    }
}
