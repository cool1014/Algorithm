package SWEA.D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [SWEA] 1545. 거꾸로 출력해 보아요 (260602)
 * <p>
 * 시간복잡도 : O(1)
 * <p>
 * 풀이과정
 * -
 */
public class T_1545 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        sb.append(n);

        while (n > 0) {
            n -= 1;
            sb.append(" ").append(n);
        }
        System.out.println(sb);
    }
}
