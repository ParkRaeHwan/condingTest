package sparta.level1;

import java.util.Arrays;

// Programmers 평균 구하기
/*
    문제 : 정수 배열 arr 의 평균값을 반환하는 로직 작성
    풀이 : Stream 을 활용해 배열의 평균값 계산
 */
public class No12 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.stream(arr).average().orElse(0));
    }
}
