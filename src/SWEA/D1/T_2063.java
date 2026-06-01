package SWEA.D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * [SWEA] 2068. 2063. 중간값 찾기 (260601)
 *
 * 시간복잡도 : O(NlogN)
 * - Array.sort()의 경우 퀵정렬을 사용하므로 전체 시간복잡도는 O(NlogN)이 됨
 *
 * 풀이과정
 * - 배열에 입력값을 대입하고 정렬함수를 사용해 중앙값 도출
 */
public class T_2063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numbers);

        System.out.println(numbers[N/2]);
    }
}
