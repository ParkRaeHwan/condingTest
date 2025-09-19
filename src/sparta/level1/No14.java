package sparta.level1;

import java.util.Scanner;

// Programmers 약수의 합
/*
    문제 : 정수의 약수를 모두 더한 값을 리턴하는 함수
    풀이 : 1 ~ n 까지를 나눗값 중 나머지가 0 이 나오는 경우 약수이므로 해당값을 누적해 값 계산
 */
public class No14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result += i;
            }
        }

        System.out.println(result);
        sc.close();
    }
}
