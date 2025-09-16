package sparta.level1;

import java.util.Scanner;

// Programmers 숫자 비교하기
/*
    문제 : 주어진 정수 2개를 비교해 두수가 같은경우 1, 다른경우 -1 을 출력하는 로직 작성
 */
public class No5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();

        System.out.println(i == j? 1 : -1); // 삼항 연산자 활용
        sc.close();
    }
}
