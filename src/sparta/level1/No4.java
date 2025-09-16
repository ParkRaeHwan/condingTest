package sparta.level1;

import java.util.Scanner;

// Programmers 나이 출력
/*
    문제 : 2022 년 기준 age 입력시 출생연도를 반환하는 로직 작성
    풀이 : 사람은 태어나자마자 한살 나이를 먹으므로 2022 + 1 에서 입력받은 age 를 빼 나이 계산
 */
public class No4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(2023 - age);
        sc.close();
    }
}
