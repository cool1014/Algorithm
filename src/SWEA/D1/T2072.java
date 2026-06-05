package SWEA.D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * [SWEA] 2072. 홀수만 더하기 (260531)
 *
 * 시간복잡도 : O(1)
 * - 내부는 10번만 고정으로 돌기 때문에 O(1)이고 전체는 O(T * 10) = O(T)가 됨
 *
 * 풀이 과정
 * - 10번 루프를 돌며 홀수 일때만 sum에 누적
 */
public class T2072 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for (int i = 0; i < 10; i++) {
                int num = Integer.parseInt(st.nextToken());
                if (num % 2 == 1) {
                    sum += num;
                }
            }
            System.out.println("#" + tc + " " + sum);


        }
    }
}
