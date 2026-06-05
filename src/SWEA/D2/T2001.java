package SWEA.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * [SWEA] 2001. 파리 퇴치 (260606)
 *
 * 시간복잡도 : O(N^2 * M^2)
 * - 4중 for문
 *
 * 풀이과정
 * - 1. 2차원 배열 생성 후 값을 넣음
 * - 2. 격자판 전체 순회 범위 설정 (i-m+1)(j-m+1)
 * - 3. 파리채 영역 안의 합 계산
 */
public class T2001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[][] arr = new int[n][n];

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int maxV = 0;

            for (int i = 0; i < n - m + 1; i++) {
                for (int j = 0; j < n - m + 1; j++) {
                    int sum = 0;
                    for (int k = 0; k < m; k++) {
                        for (int l = 0; l < m; l++) {
                            sum += arr[i+k][j+l];
                        }
                    }
                    maxV = Math.max(maxV, sum);
                }
            }

            System.out.println("#" + tc + " " + maxV);
        }
    }
}
