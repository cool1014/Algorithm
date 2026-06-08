package SWEA.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [SWEA] 1986. 지그재그 숫자 (260607)
 *
 * 시간복잡도 : O(N)
 *
 * 풀이과정
 * - 홀수일때 더하고 짝수일때 빼기
 *
 */
public class T1986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());
            int total = 0;

            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) total += i;
                else total -= i;
            }
            System.out.println("#" + tc + " " + total);
        }
    }
}
