package sparta.level2;

import java.util.Scanner;

// Programmers 문자열 다루기
/*
    문제 : 문자열의 길이가 4 or 6 이고 숫자로만 구성돼있는지 확인해주는 로직 작성
    풀이 : 입력받은 문자열을 1차로 길이가 4 or 6 인지 검증후 통과되는경우
          해당 문자열을 문자단위 배열로 변환후 아스키코드 값을 이용해 각 문자가 숫자인지를 검증 (0 = 48, 9 = 57)
 */
public class No36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean result = true;

        if (s.length() == 4 || s.length() == 6) {
            char[] charArray = s.toCharArray();
            for (char c : charArray) {
                if (!(c >= 48 && c <= 57)) {
                    result = false;
                }
            }
        } else {
            result = false;
        }
        System.out.println(result);

        sc.close();
    }
}
