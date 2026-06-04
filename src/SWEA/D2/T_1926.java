package SWEA.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [SWEA] 1926. 간단한 369게임 (260604)
 *
 * 시간복잡도 : O(N)
 *
 * 풀이과정
 * - 1. 1부터 N까지 반복문을 돌며 각 숫자가 3, 6, 9를 몇번 포함하고 있는지 카운트
 * - 2. 숫자를 10으로 나눈 나머지를 통해 일의 자리부터 369 여부 확인
 * - 3. 369가 있다면 개수만큼 "-"를 추가
 * - 4. 포함되지 않은 숫자는 그대로 결과에 추가
 *
 * % SWEA에서는 버전이 달라서 repeat 메서드 사용 안됨.
 */
public class T_1926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        sb.append(1);

        for (int i = 2; i <= n; i++) {
            int cnt = 0;
            int num = i;
            while (num > 0) {
                int c = num % 10;
                if (c == 3 || c == 6 || c == 9) {
                    cnt++;
                }
                num /= 10;
            }
            if (cnt > 0) {
                sb.append(" ");
                for (int j = 0; j < cnt; j++) {
                    sb.append("-");
                }
            } else {
                sb.append(" ").append(i);
            }

        }

        System.out.println(sb);

    }
}
