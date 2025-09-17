package sparta.level1;

import java.util.Scanner;

// Programmers 짝수의 합
/*
    문제 : 정수 n 이 주어질때 n 이하의 짝수를 모두 더한값을 반환하는 로직 작성
 */
public class No9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }

        System.out.println(result);

        // stream 을 이용한 계산
        // IntStream.rangeClosed(0, n).filter(value -> value % 2 == 0).sum();

        sc.close();
    }
}
