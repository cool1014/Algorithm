package SWEA.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [SWEA] 1989. 초심자의 회문 검사 (260606)
 *
 * 시간복잡도 : O(N)
 *
 * 풀이과정
 * - 투 포인터를 활용
 * - 문자열의 처음과 마지막 단어를 하나씩 비교
 */
public class T_1989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            String word = br.readLine();
            int p1 = 0;
            int p2 = word.length()-1;
            int isPalindrome = 1;

            while (p1 < p2) {
                if (word.charAt(p1) != word.charAt(p2)) {
                    isPalindrome = 0;
                    break;
                }
                p1 += 1;
                p2 -= 1;
            }
            System.out.println("#" + tc + " " + isPalindrome);
        }
    }
}
