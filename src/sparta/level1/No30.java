package sparta.level1;

import java.util.Scanner;

// Programmers 가운데 글자 가져오기
/*
    문제 : 단어의 가운데 글자를 반환하는 로직 작성
          (길이가 짝수인경우 가운데 두글자 반환, 1 <= s.length <= 100)
    풀이 : 문자열 길이가 짝수인 경우 /2 -1 + /2 위치의 문자를 선택해 결과 생성,
                     홀수인 경우 /2 위치의 문자를 선택해 결과 생성
 */
public class No30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = "";

        if (s.length() % 2 == 0) {
            result += s.charAt((s.length() / 2) - 1) + s.charAt(s.length() / 2);
        } else {
            result += s.charAt(s.length() / 2);
        }

        System.out.println(result);

        sc.close();
    }
}
