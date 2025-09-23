package sparta.level1;

import java.util.Scanner;

// Programmers 정수 제곱근 판별
/*
    문제 : 양의 정수 n 이 양의 정수 x 제곱인경우 x + 1 의 제곱을 반환하고 아닌경우 -1을 반환하는 로직 작성
    풀이 : 양의 정수를 sqrt() 연산을 통해 계산한 값에 % 1 값이 0 이 아닌경우 즉 제곱수가 아닌경우 -1 을 반환하고
          0 인경우 기존 값이 + 1 을 수행한후 제곱을 반환
 */
public class No19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long result = 0;
        if (Math.sqrt(n) % 1 != 0) {
            result = -1;
        } else {
            result = (long) Math.pow(Math.sqrt(n) + 1 , 2);
        }

        System.out.println(result);
        sc.close();
    }
}
