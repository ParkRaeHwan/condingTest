package sparta.level1;

import java.util.Arrays;

// Programmers 배열의 평균값
/*
    문제 : 주어진 정수 배열내 원소의 평균값을 반환하는 로직 작성
    풀이 : Stream 을 활용해 배열내 평균값 계산
 */
public class No10 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.stream(numbers).average().orElse(0));
    }
}
