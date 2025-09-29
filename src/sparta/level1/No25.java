package sparta.level1;

import java.util.Arrays;

// Programmers 나누어 떨어지는 숫자 배열
/*
    문제 : 배열의 요소중 divisor 로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 로직 작성
          나누어 떨어지는 요소가 없는 경우 배열에 -1 담아 반환
          (divisor = 자연수, array = 길이가 1 이상인 배열, arr = 자연수 배열)
    풀이 : 입력받은 배열의 요소를 정렬 시킨후 divisor 로 나누어 떨어지는 값을 result 배열에 추가 (result 배열에서 길이를 +1 후 요소 입력)
          모든 요소에대해 위 과정을 반복한뒤 배열의 길이가 0 인 경우 나누어 떨어지는 요소가 없으므로 -1 을 요소로 갖는 배열 생성
 */
public class No25 {
    public static void main(String[] args) {
        int[] arr = {3,2,6};
        Arrays.sort(arr);
        int divisor = 10;
        int[] result = {};

        for (int i : arr) {
            if (i % divisor == 0) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = i;
            }
        }
        // 나누어 떨어지는 요소 X
        if (result.length == 0) {
            result = new int[]{-1};
        }

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
