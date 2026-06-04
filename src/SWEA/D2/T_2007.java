package SWEA.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [SWEA] 2007. 패턴 마디의 길이 (260604)
 *
 * 시간복잡도 : O(N)
 *
 * 풀이과정
 * - substring() 메서드를 활용하여 문자열을 동일한 길이 i만큼 두 구간으로 쪼갬
 * - 두 마디가 일치한다면 max값에 i를 저장하고 break!
 */
public class T_2007 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            String text = br.readLine();
            int maxV = 0;
            for (int i = 1; i <= 10; i++) {
                if (text.substring(0, i).equals(text.substring(i, i * 2))) {
                    maxV = i;
                    break;
                }
            }
            System.out.println("#" + tc + " " + maxV);
        }
    }
}
