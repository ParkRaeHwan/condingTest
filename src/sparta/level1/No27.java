package sparta.level1;

import java.util.Scanner;

// Programmers 핸드폰 번호 가리기
/*
    문제 : 전화번호 문자열이 주어졌을떄 뒷 4자리를 제외한 나머지 숫자를 전부 * 로 가린 문자열을 반환하는 로직 작성
          (4 <= phone_number.length <= 20)
    풀이 :
 */
public class No27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phone_number = sc.nextLine();
        String result = "";

        for (int i = 0; i < phone_number.length(); i++) {
            if (phone_number.length() - 4 <= i) {
                result += phone_number.charAt(i);
            } else {
                result += "*";
            }
        }
        System.out.println(result);

        sc.close();
    }
}
