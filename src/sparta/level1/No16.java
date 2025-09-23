package sparta.level1;

import java.util.Scanner;

// Programmers x 만큼 간격이 있는 n개의 숫자
/*
    문제 : 정수 x, 자연수 n 이 주어졌을때 정수 x 부터 x 만큼 증가하는 n 개의 리스트를 반환하는 로직 작성
          (-10000000 <= x <= 10000000, 1 <= n <= 1000)
    풀이 : n 크기의 long 타입 배열을 생성한뒤 각 인덱스별로 x 부터 x 만큼 증가하는 값 삽입
 */
public class No16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        long[] result = new long[n];
        long x2 = x;

        for (int i = 0; i < n; i++) {
            result[i] = x2;
             x2 += x;
        }

        for (long l : result) {
            System.out.print(l + " ");
        }

        sc.close();
    }
}
