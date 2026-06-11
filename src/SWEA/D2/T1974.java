package SWEA.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * [SWEA] 1974. 스도쿠 검증 (260611)
 *
 * 시간복잡도 : O(1)
 * - 9x9 최대 3번 반복
 *
 * 풀이과정
 * - 1. 가로, 세로, 격자 총 3번 검증
 * - 2. 해시셋을 사용하여 숫자가 세트에 없으면 넣고 있으면 break
 */
public class T1974 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int[][] sudoku = new int[9][9];

            for (int i = 0; i < 9; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");

                for (int j = 0; j < 9; j++) {
                    sudoku[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int flag = 1;

            // 스도쿠 가로 검증
            for (int i = 0; i < 9; i++) {
                if (flag == 0) break;
                Set<Integer> numbers = new HashSet<>();
                for (int j = 0; j < 9; j++) {
                    if (numbers.contains(sudoku[i][j])) {
                        flag = 0;
                        break;
                    }
                    numbers.add(sudoku[i][j]);
                }
            }

            // 스도쿠 세로 검증
            for (int j = 0; j < 9; j++) {
                if (flag == 0) break;
                Set<Integer> numbers = new HashSet<>();
                for (int i = 0; i < 9; i++) {
                    if (numbers.contains(sudoku[i][j])) {
                        flag = 0;
                        break;
                    }
                    numbers.add(sudoku[i][j]);
                }
            }

            // 스도쿠 격자 검증
            for (int i = 0; i < 9; i += 3) {
                if (flag == 0) break;
                for (int j = 0; j < 9; j += 3) {
                    Set<Integer> numbers = new HashSet<>();
                    for (int k = i; k < i + 3; k++) {
                        if (flag == 0) break;
                        for (int l = j; l < j + 3; l++) {
                            if (numbers.contains(sudoku[k][l])) {
                                flag = 0;
                                break;
                            }
                            numbers.add(sudoku[k][l]);
//                            System.out.print(sudoku[k][l] + " ");
                        }
//                        System.out.println();
                    }
                }
            }

            System.out.println("#" + tc + " " + flag);
        }
    }
}
