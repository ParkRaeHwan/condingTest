package sparta.level2;

import java.util.Scanner;

// Programmers 이상한 문자 만들기
/*
    문제 : 영어로 구성된 문자열에서 각 단어별 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 변경하는 로직 작성
           (단어별 짝/홀 인덱스 판단, 0번째 인덱스는 짝수 처리)
    풀이 : 각 단어별 위치를 판단하기위해 index 변수를 사용해 짝/홀 인덱스를 계산해 처리하였고,
          공백이 나오는 경우 다음에 새로운 단어가 나오므로 index 값을 0으로 초기화
 */
public class No41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = "";
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                index = 0;
                result += " ";
                continue;
            }

            if (index % 2 == 0) {
                result += s.toUpperCase().charAt(i);
            } else {
                result += s.toLowerCase().charAt(i);
            }
            index++;
        }

        System.out.print(result);
        sc.close();
    }
}
