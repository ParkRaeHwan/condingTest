package sparta.level1;

import java.util.Arrays;
import java.util.Optional;

// Programmers 서울에서 김서방 찾기
/*
    문제 : String 배열 seoul 의 요소중 Kim 의 위치를 찾아 김서방은 x에 있다 는 문자열을 반환하는 로직 작성
    풀이 :
 */
public class No24 {
    public static void main(String[] args) {
        String[] seoul = {"Jann", "Kim"};
        int index = 0;
        for (String s : seoul) {
            if (s.equals("Kim")){
                break;
            }
            index++;
        }

        System.out.println("김서방은 " + index + "에 있다");
    }
}
