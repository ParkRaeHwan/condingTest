package sparta.level1;

import java.util.Scanner;

// Programmers 두 수의 나눗셈
/*
    문제 : 주어진 두 정수를 나눈값에 1000을 곱한 후 정수 부분을 반환하는 로직 작성
    풀이 : 소수점을 반환하기 위해 float 으로 캐스팅 이후 1000을 곱한뒤 int 타입으로 캐스팅해
        소수점 이하 부분 제거
 */
public class No7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println((int)(((float) a / (float) b) * 1000));

        sc.close();
    }
}
