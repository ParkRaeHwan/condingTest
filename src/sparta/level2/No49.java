package sparta.level2;

// Programmers 두 개 뽑아서 더하기
/*
    문제 : 정수 배열 numbers 내 모든 원소들을 2개 합해서 나올수 있는 모든 수 구한뒤 오름차순으로 정렬해 결과 반환 (중복 제거)
          (2 <= numbers.length <= 100, 0 <= numbers[n] <= 100)
    풀이 : 주어진 정수 배열을 이중 for 문을 통해 나올수있는 모든 수를 구한뒤 Set 자료 구조에 넣어 중복을 제거한뒤 배열로 결과 반환
          (제네릭 타입 + Arrays.sort() 주의)
 */

import java.util.HashSet;
import java.util.Set;

public class No49 {
    public static void main(String[] args) {
        int[] numbers = {5, 0, 2, 7};
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        int[] result = set.stream()
                .mapToInt(Integer::intValue)
                .sorted()
                .toArray();

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}

