package SWEA.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * [SWEA] 1976. 시각 덧셈 (260610)
 *
 * 시간복잡도 : O(1)
 *
 * 풀이과정
 * - 1. 주어진 시와 분끼리 더함
 * - 2. 분은 더해서 60 넘으면 시에 값을 더하고 60으로 나눈 나머지로 저장
 * - 3. 시는 12가 넘으면 12로 나눈 나머지로 저장 후 0시가 아닌 12시로 표기
 */
public class T1976 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int hour1 = Integer.parseInt(st.nextToken());
            int minute1 = Integer.parseInt(st.nextToken());
            int hour2 = Integer.parseInt(st.nextToken());
            int minute2 = Integer.parseInt(st.nextToken());

            int hour = hour1 + hour2;
            int minute = minute1 + minute2;

            if (minute > 60) {
                hour = hour + minute / 60;
                minute = minute % 60;
            }
            if (hour > 12) hour = hour % 12;
            if (hour == 0) hour = 12;

            System.out.println("#" + tc + " " + hour + " " + minute);

        }
    }
}
