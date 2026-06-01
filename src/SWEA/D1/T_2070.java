package SWEA.D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * [SWEA] 2070. 큰 놈, 작은 놈, 같은 놈 (260601)
 *
 * 시간복잡도 : O(1)
 * - 루프가 2*T 번 돌아감
 *
 * 풀이과정
 * - if문을 활용해 숫자 비교 후 부등호 출력
 */
public class T_2070 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            if (num1 > num2) {
                System.out.println("#"+tc+" "+">");
            } else if (num2 > num1) {
                System.out.println("#"+tc+" "+"<");
            } else if (num2 == num1) {
                System.out.println("#"+tc+" "+"=");
            }
        }
    }
}
