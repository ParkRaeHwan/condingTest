package sparta.level2;

import java.util.ArrayList;
import java.util.Collections;

// Programmers 문자열 내 마음대로 정렬하기
/*
    문제 : 문자열 배열 strings 의 각 원소들의 n 번째 글자를 기준으로 배열안 원소 오름차순 정렬
          (1 <= strings.length <= 50, 소문자 알파벳 구성, 1 <= string[i].length <= 100)
          (n 번째 글자가 동일한 경우 사전순으로 앞선 문자열이 앞쪽에 위치)
    풀이 :

 */
public class No47 {
    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;

        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                char c1 = strings[i].charAt(n);
                char c2 = strings[j].charAt(n);
                
                // compareTo : 문자열 사전순 비교 (0 이상(true) = 앞의 수가 사전순으로 뒤에 있다는 의미, 0 미만은 반대)
                if (c1 > c2 || (c1 == c2 && strings[i].compareTo(strings[j]) > 0)) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }

        for (String string : strings) {
            System.out.print(string + " ");
        }

        // 문자열의 n 번째 문자를 맨앞에 추가해 정렬한뒤 제거 하는 방법
//        String[] answer = {};
//        ArrayList<String> arr = new ArrayList<>();
//        for (int i = 0; i < strings.length; i++) {
//            arr.add("" + strings[i].charAt(n) + strings[i]);
//        }
//        Collections.sort(arr);
//        answer = new String[arr.size()];
//        for (int i = 0; i < arr.size(); i++) {
//            answer[i] = arr.get(i).substring(1, arr.get(i).length());
//        }
//        return answer;
    }
}