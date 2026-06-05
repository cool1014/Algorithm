package SWEA.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * [SWEA] 1859. 백만 장자 프로젝트 (260603)
 *
 * 시간복잡도 : O(N)
 *
 * 풀이과정
 * - N일의 역순을 비교해야 가장 비싼 매매가를 알 수 있음
 * - 1. 매매가를 배열에 순서대로 저장
 * - 2. 마지막 날의 값을 max 변수에 저장하고 그 전날부터 역순으로 for문
 * - 3. 현재 날의 값이 max보다 크다면 max에 현재 값을 대입 작다면 max에서 현재 값을 뺀 값을 결과에 더함
 *
 * % int의 최대 범위는 약21억 => long을 사용해라...
 */
public class T1859 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int[] price = new int[n];
            for (int i = 0; i < n; i++) {
                price[i] = Integer.parseInt(st.nextToken());
            }

            long result = 0;
            int maxV = price[n-1];

            for (int i = n - 2; i >= 0; i--) {
                int p = price[i];
                if (p >= maxV) {
                    maxV = p;
                } else {
                    result += maxV - p;
                }

            }

            System.out.println("#" + tc + " " + result);

        }
    }
}
