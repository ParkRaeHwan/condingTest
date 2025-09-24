package sparta.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// Programmers 정수 내림차순으로 배치하기
/*
    문제 : 정수 n 의 각 자릿수를 큰것부터 작은 순으로 정렬한 정수를 반환하는 로직 작성
    풀이 : 정수 n 을 string 으로 변환 후 각 자릿수 분리 -> 정렬한뒤 결과 string 을 생성한뒤 Long 타입으로 캐스팅해 결과 생성
 */
public class No20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String ns = String.valueOf(n);
        String[] split = ns.split("");
        String[] string = Arrays.stream(split).sorted(Collections.reverseOrder()).toArray(String[]::new);

        String result = "";
        for (String s : string) {
            result += s;
        }

        System.out.println(Long.parseLong(result));
        sc.close();
    }
}
