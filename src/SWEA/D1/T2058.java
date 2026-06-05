package SWEA.D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [SWEA] 2058. 자릿수 더하기 (260602)
 *
 * 시간복잡도 : O(1)
 * - N이 9999이하이므로 최대 4번 루프를 돔
 * 풀이과정
 * - while문을 통해 N을 10으로 나눈 값의 나머지를 계속 더함
 */
public class T2058 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        while (N > 0) {
            sum += N % 10;
            N /= 10;
        }
        System.out.println(sum);
    }
}
