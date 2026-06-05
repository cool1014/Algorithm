package SWEA.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [SWEA] 2005. 파스칼의 삼각형 (260605)
 *
 * 시간복잡도 : O(N^2)
 * - 2중 for문
 *
 * 풀이과정
 * - 1. 매 줄의 첫 값은 항상 1
 * - 2. C(i, j) = C(i, j-1) × (i-j+1) / j 점화식을 이용해 각 줄을 순서대로 계산 (val에 이전값 저장)
 *
 * % 재귀 혹은 자료구조를 활용해서도 풀 수 있지만 수학적 사고를 바탕으로 풀이함.
 *
 * * 조합 : 서로 다른 n개의 원소에서 r(0<r<=n)개를 중복 없이 순서를 고려하지 않고 선택하는 것
 */
public class T2005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            sb.append("#" + tc).append("\n").append(1).append("\n");

            for (int i = 1; i < n; i++) {
                int val = 1;
                sb.append(val);
                for (int j = 1; j <= i; j++) {
                    val = val * (i - j + 1) / j;
                    sb.append(" " + val);
                }
                sb.append("\n");
            }
            System.out.print(sb);
        }
    }
}
