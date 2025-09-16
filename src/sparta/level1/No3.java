package sparta.level1;

import java.util.Scanner;

// Programmers 몫 구하기
/*
    문제 : 입력된 n 을 x 로 나눈 몫을 구하는 로직 작성
 */
public class No3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(n / x);
        sc.close();
    }
}
