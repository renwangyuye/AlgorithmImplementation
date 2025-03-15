package part2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class p1059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = removeDup(arr);
        Arrays.sort(res);
        System.out.println(res.length);
        for (int num : res) {
            System.out.print(num + " ");
        }
        
    }
    public static int[] removeDup(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int n : arr) {
            set.add(n);
        }
        int[] res = new int[set.size()];
        int i = 0;
        for (int n : set) {
            res[i++] = n;
        }
        return res;
    }
}
