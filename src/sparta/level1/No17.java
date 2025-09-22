package sparta.level1;

import java.util.ArrayList;
import java.util.Scanner;

// Programmers 자연수 뒤집어 배열로 만들기
/*
    문제 : 자연수 n 을 뒤집어 각 자리 숫자를 원소로 가지는 배열 반환하는 로직 작성
    풀이 : 자연수 n 길이 만큼의 배열을 생성한후, & / 연산을 통해 각 자릿수의 값을 구해 원소로 삽입해 배열 생성
 */
public class No17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        // 배열 크기를 구하기위해 문자열로 변환후 문자열의 길이를 통해 배열 생성
        int[] result = new int[String.valueOf(n).length()];
        int index = 0;

        while (n > 0) {
            result[index] = ((int) (n % 10));
            n /= 10;
            index++;
        }

        for (int i : result) {
            System.out.println(i);
        }
        sc.close();
    }
}

