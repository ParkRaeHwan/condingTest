package sparta.level1;

import java.util.Scanner;

// Programmers 문자열을 정수로 바꾸기
/*
    문제 : 문자열 s를 숫자로 변환환 결과를 반환하는 함수 작성 (반드시 부호, 숫자로만 구성 잘못입력되는 경우 없음)
    풀이 : Integer.parseInt() 를 통해 문자열 숫자로 변환 
 */
public class No18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = Integer.parseInt(s);
        sc.close();
    }
}
