package sparta.level1;

import java.util.Scanner;

// Programmers 짝수와 홀수
/*
    문제 : 정수 num 이 짝수인 경우 Even, 홀수인 경우 Odd 를 반환하는 로직 작성
    풀이 : 삼항연산자를 사용해 결과 출력
 */
public class No11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(num % 2 == 0? "Even": "Odd");
        sc.close();
    }
}
