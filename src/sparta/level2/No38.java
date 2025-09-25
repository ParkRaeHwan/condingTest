package sparta.level2;

import java.util.Scanner;

// Programmers 직사각형 별찍기
/*
    문제 : 가로길이가 n 세로길이가 m인 직사각형 출력하는 로직 작성
    풀이 : 이중 for 문을 사용해 가로, 세로 길이 만큼 * 출력
 */
public class No38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
