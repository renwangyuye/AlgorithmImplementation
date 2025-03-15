package part2;

import java.util.Scanner;

public class p2005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] qmscores = new int[n];
        int[] bjscores = new int[n];
        String[] isboss = new String[n];
        String[] iseast = new String[n];
        int[] papernums = new int[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            qmscores[i] = sc.nextInt();
            bjscores[i] = sc.nextInt();
            isboss[i] = sc.next();
            iseast[i] = sc.next();
            papernums[i] = sc.nextInt();
        }
        sc.close();

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            if (qmscores[i] > 80 && papernums[i] >= 1) res[i] += 8000;
            if (qmscores[i] > 85 && bjscores[i] >80) res[i] += 4000;
            if (qmscores[i] > 90) res[i] += 2000;
            if (qmscores[i] > 85 && iseast[i].equals("Y")) res[i] += 1000;
            if (bjscores[i] > 80 && isboss[i].equals("Y")) res[i] += 850;
        }
        int resIndex = -1; 
        int max = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (res[i] > max) {
                max = res[i];
                resIndex = i;
            }
            count += res[i];
        }
        System.out.println(names[resIndex]);
        System.out.println(res[resIndex]);
        System.out.println(count);
    }
}
