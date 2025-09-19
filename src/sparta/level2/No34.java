package sparta.level2;

import java.util.Arrays;
import java.util.Collections;

// Programmers 문자열 내림차순으로 배치하기
/*
    문제 : 문자열에서 문자를 큰것부터 작은순으로 정렬하는 로직 작성 (대문자는 소문자보다 작은것으로 간주)
    풀이 : split 메서드를 통해 기존 String 을 String 배열로 변환후 내림차순 정렬한뒤 결과 문자열 생성
    ++ StringBuilder, Stream 정렬 기능을 이용한 정렬, 문자열을 대, 소문자 구분후 따로 정렬후 연결해 정렬하는 방법
 */
public class No34 {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        String result = "";

        String[] StringArray = s.split("");
        Arrays.sort(StringArray, Collections.reverseOrder());

        for (String string : StringArray) {
            result += string;
        }

        System.out.println(result);
    }
}
