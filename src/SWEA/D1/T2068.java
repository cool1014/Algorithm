package SWEA.D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * [SWEA] 2068. 최대수 구하기 (260601)
 *
 * 시간복잡도 : O(1)
 * - 10*T만큼 처리
 *
 * 풀이과정
 * - maxV 변수에 입력값중 가장 작은 값을 넣고
 * - 숫자를 비교해 큰 수로 값을 대입
 */
public class T2068 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int maxV = 0;

            for (int i = 0; i < 10; i++) {
                int num = Integer.parseInt(st.nextToken());
                if (maxV < num) maxV = num;
            }
            System.out.println("#" + tc + " " + maxV);
        }
    }
}
