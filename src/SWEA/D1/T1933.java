package SWEA.D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [SWEA] 1933. 간단한 N 의 약수 (260602)
 *
 * 시간복잡도 : O(1)
 *
 * 풀이과정
 * - 1부터 N까지 나머지가 0인 약수 출력
 */
public class T1933 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        sb.append(1);
        for (int i = 2; i <= n; i++) {
            if (n%i == 0) sb.append(" " + i);
        }
        System.out.println(sb);

    }
}
