package sparta.level1;

import java.util.Scanner;
import java.util.stream.Stream;

// Programmers 두 정수 사이의 합
/*
    문제 : 두 정수 사이에 속한 모든 정수의 합을 반환하는 로직 작성
    풀이 : 두 수중 작은 값을 구한뒤 반복문의 조건으로 설정해 작은 수 ~ 큰 수 사이의 정수값을 구함
 */
public class No22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int min = a;
        int max = b;
        if (a > b) {
            max = a;
            min = b;
        }
        long result = 0;
        for (int i = min; i <= max; i++) {
            result += i;
        }
        System.out.println(result);
        sc.close();
    }
}
