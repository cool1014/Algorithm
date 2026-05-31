package SWEA.D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * [SWEA] 2071. 평균값 구하기
 *
 * 시간복잡도 : O(T)
 * - 내부는 10번 고정 O(1), 전체는 O(T*10) = O(T)
 *
 * 풀이과정
 * - 10번 루프를 돌며 sum에 누적
 * - Math.round(); 메서드를 활용해 sum을 10.0으로 나누고 int 변환
 */
public class T_2071 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int sum = 0;

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for (int i = 0; i < 10; i++) {
                int num = Integer.parseInt(st.nextToken());
                sum += num;

            }
            // 정수를 /로 나누면 버림이 되므로 10.0으로 나눠 소수점 살리고 형변환
            int avg = (int) Math.round(sum / 10.0);

            System.out.println("#" + tc + " " + avg);
        }
    }
}
