package SWEA.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * [SWEA] 1983. 조교의 성적 매기기 (260608)
 *
 * 시간복잡도 : O(NlogN)
 * - list.sort() 사용
 *
 * 풀이과정
 * - 1. 학생 총점을 arraylist, 등급을 배열, k번째 학생의 점수를 저장하기 위해 변수 만들기
 * - 2. 각 학생의 총점을 계산하여 add()하고 k번째 학생의 점수 저장
 * - 3. 학생의 점수를 내림차순 정렬
 * - 4. 반복을 통해 k학생의 점수를 찾으면 학생 수 비율에 맞게 등급 산출 후 break
 */
public class T1983 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            List<Double> students = new ArrayList<>();
            String[] grade = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
            double kScore = 0;

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int midScore = Integer.parseInt(st.nextToken());
                int finScore = Integer.parseInt(st.nextToken());
                int assignment = Integer.parseInt(st.nextToken());
                double score = midScore*0.35 + finScore*0.45 + assignment*0.2;
                students.add(score);

                if (i == k-1) kScore = score;
            }

            students.sort(Comparator.reverseOrder());

            for (int i = 0; i < n; i++) {
                if (students.get(i) == kScore) {
                    int iIndex = i / (n / 10);
                    System.out.println("#"+tc+" "+grade[iIndex]);
                    break;
                }
            }


        }
    }
}
