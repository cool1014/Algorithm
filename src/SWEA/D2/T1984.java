package SWEA.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * [SWEA] 1984. 중간 평균값 구하기 (260607)
 *
 * 시간복잡도 : O(1)
 *
 * 풀이과정
 * - 1. 10개의 수를 배열에 저장
 * - 2. Arrays.sort() 를 활용해 오름차순 정렬
 * - 3. 처음과 마지막 배열의 수를 제외하고 모두 더함
 * - 4. Math.round() 를 활용해 평균을 반올림
 */
public class T1984 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int[] arr = new int[10];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < 10; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            int sum = 0;

            for (int i = 1; i < 9; i++) {
                sum += arr[i];
            }

            int avg = (int) Math.round(sum / 8.0);

            System.out.println("#" + tc + " " + avg);
        }
    }
}
