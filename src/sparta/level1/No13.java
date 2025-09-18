package sparta.level1;

import java.util.Scanner;

// Programmers 자릿수 더하기
/*
    문제 : 자연수 N의 각 자릿수의 합을 반환하는 로직 작성
    풀이 : % 연산을 통해 자릿수를 구하고, / 연산을 통해 마지막 자릿수를 자른후 다음연산에 사용하는 과정을 반복
 */
public class No13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        while (!(n < 10)) {
            result += n % 10;
            n /= 10;
        }
        result += n;
        System.out.println(result);
        sc.close();
    }
}
