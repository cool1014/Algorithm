package SWEA.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [SWEA] 1970. 쉬운 거스름돈 (260611)
 *
 * 시간복잡도 :
 *
 * 풀이과정
 * - 1. 화폐 단위를 배열에 저장
 * - 2. 반복을 통해 돈을 화폐로 나눈 몫은 출력하고 나머지 돈을 저장
 */
public class T1970 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            StringBuilder sb = new StringBuilder();
            sb.append("#" + tc).append("\n");

            int n = Integer.parseInt(br.readLine());
            int[] currency = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

            for (int i = 0; i < 8; i++) {
                sb.append(n/currency[i] + " ");
                n = n % currency[i];
            }

            System.out.println(sb);
        }
    }
}
