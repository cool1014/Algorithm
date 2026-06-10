package SWEA.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * [SWEA] 1979. 어디에 단어가 들어갈 수 있을까 (260610)
 *
 * 시간복잡도 : O(N^2)
 *
 * 풀이과정
 * - 1. 퍼즐을 2차원 배열에 저장
 * - 2. 가로줄과 세로줄을 돌면서 연속하는 흰색 부분이 k와 같다면 결과에 1을 추가 넘으면 1을 뺌
 */
public class T1979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[][] puzzle = new int[n][n];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < n; j++) {
                    puzzle[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int result = 0;
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 0; j < n; j++) {
                    if (puzzle[i][j] == 1) sum += 1;
                    else sum = 0;

                    if (sum == k) result++;
                    else if (sum == k+1) result--;
                }
            }

            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 0; j < n; j++) {
                    if (puzzle[j][i] == 1) sum += 1;
                    else sum = 0;

                    if (sum == k) result++;
                    else if (sum == k+1) result--;
                }
            }
            System.out.println("#" + tc + " " + result);
        }
    }
}
