package SWEA.D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [SWEA] 2056. 연월일 달력 (260602)
 *
 * 시간복잡도 : O(1)
 *
 * 풀이과정
 * - substring()를 활용해 년원일로 나누고 유효한 날짜인지 검사
 */
public class T2056 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int flag = 1;

            String date = br.readLine();
            String y = date.substring(0, 4);
            String m = date.substring(4, 6);
            String d = date.substring(6);

            int day = Integer.parseInt(d);

            if (m.equals("02")) {
                if (day < 1 || day > 28) flag = -1;
            } else if (m.equals("01") || m.equals("03") || m.equals("05") || m.equals("07") || m.equals("08") || m.equals("10") || m.equals("12")) {
                if (day < 1 || day > 31) flag = -1;
            } else if (m.equals("04") || m.equals("06") || m.equals("09") || m.equals("11")) {
                if (day < 1 || day > 30) flag = -1;
            } else flag = -1;

            if (flag == 1) {
                System.out.println("#" + tc + " " + y + "/" + m + "/" + d);
            } else {
                System.out.println("#" + tc + " " + flag);
            }

        }
    }
}


