package SWEA.D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * [SWEA] 1936. 1대1 가위바위보 (260602)
 *
 * 시간복잡도 : O(1)
 *
 * 풀이과정
 * -
 */
public class T1936 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if ((a == 2 && b == 1) || (a == 3 && b == 2) || (a == 1 && b == 3)) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}
