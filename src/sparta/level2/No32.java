package sparta.level2;

import java.util.Arrays;
import java.util.Scanner;

// Programmers 내적
/*
    문제 : 길이가 같은 두 1차원 정수 배열 a, b 의 내적을 반환하도록 로직작성
    풀이 : 두 정수 배열은 길이가 동일하므로 한쪽 배열의 길이를 이용해 반복문 조건을 설정한후
        결과값에 내적을 구한값을 누적해 결과 생성
 */
public class No32 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};
        System.out.println(solution(a, b));
    }

    public static int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer = answer + (a[i] * b[i]);
        }
        return answer;
    }}
