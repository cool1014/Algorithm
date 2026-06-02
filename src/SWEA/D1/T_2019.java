package SWEA.D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [SWEA] 2019. 더블더블 (260602)
 *
 * 시간복잡도 : O(1)
 *
 * 풀이과정
 * -
 */
public class T_2019 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        sb.append(1);

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= 2;
            sb.append(" ").append(result);
        }
        System.out.println(sb);
    }
}
