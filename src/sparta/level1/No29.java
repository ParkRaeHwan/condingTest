package sparta.level1;

import java.util.Arrays;

// Programmers 제일 작은 수 제거하기
/*
    문제 : 정수 arr 에서 가장 작은 수를 제거한 배열을 반환하는 로직 작성
          (빈 배열의 경우 01 반환, 1 <= arr.length)
    풀이 : arr 의 길이가 1 인경우 -1만 포함된 배열을 반환하며, 
          아닌경우 stream 을 통해 배열의 최소값을 구한뒤 배열에서 제거하도록 구현
 */
public class No29 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int[] result = {};
        if (arr.length == 1) {
            result = Arrays.copyOf(result, result.length + 1);
            result[result.length - 1] = -1;
        } else {
            int min = Arrays.stream(arr).min().getAsInt();
            result = Arrays.stream(arr).filter(ele -> ele > min).toArray();
        }

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
