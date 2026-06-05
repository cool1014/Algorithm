package SWEA.D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [SWEA] 2025. N줄덧셈 (260602)
 *
 * 시간복잡도 : O(1)
 *
 * 풀이과정
 * - while문 활용
 */
public class T2025 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        while (n > 0) {
            sum += n;
            n -= 1;
        }
        System.out.println(sum);
    }
}
