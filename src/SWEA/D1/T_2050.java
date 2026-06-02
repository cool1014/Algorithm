package SWEA.D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [SWEA] 2050. 알파벳을 숫자로 변환 (260602)
 *
 * 시간복잡도 : O(1)
 *
 * 풀이과정
 * - 각 알파벳을 int로 변환 -> 아스키 코드 값에서 64 뺌
 */
public class T_2050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String alpa = br.readLine();
        sb.append((int)alpa.charAt(0)-64);

        for (int i = 1; i < alpa.length(); i++) {
            sb.append(" ");
            sb.append((int)alpa.charAt(i)-64);
        }
        System.out.println(sb);

    }
}
