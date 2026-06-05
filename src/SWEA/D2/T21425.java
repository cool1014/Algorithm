package SWEA.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * [SWEA] 21425. += (260603)
 *
 * 시간복잡도 : O(logN)
 * - 루프마다 더 작은 값에 큰 값을 더해주는 방식이므로 피보나치 수열의 형태, 즉 O(logN)
 *
 * 풀이과정
 * - A혹은 B의 값이 연산으로 N 초과가 되기 위한 최소한의 수를 구하는 문제이므로
 * - while 문을 활용해 A와B 중 더 큰 값을 더해줌
 */
public class T21425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int cnt = 0;

            while (a <= n && b <= n) {
                if (a >= b) b += a;
                else a += b;
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}
