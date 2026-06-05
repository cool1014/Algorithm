package SWEA.D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [SWEA] 2047. 신문 헤드라인 (260602)
 * <p>
 * 시간복잡도 : O(1)
 * <p>
 * 풀이과정
 * - 반복문 사용
 */
public class T2046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            sb.append("#");
        }
        System.out.println(sb);
    }
}
