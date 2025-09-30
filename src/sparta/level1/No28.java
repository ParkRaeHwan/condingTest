package sparta.level1;

// Programmers 없는 숫자 더하기
/*
    문제 : 0 ~ 9 숫자중 일부가 들어있는 배열에서 0 ~ 9 숫자중 존재하지않는 숫자를 더해 반환하는 로직 작성
          (1 <= numbers.length <= 9, 0 <= numbers[i] <= 9, 모든 요소는 서로 상이)
    풀이 : 0 ~ 9 까지의 총 합은 45 이므로 45 에서 배열의 모든 원소를 뺀값을 구해 존재하지 않는 숫자의 합을 계산
 */
public class No28 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
        int result = 45;
        for (int number : numbers) {
            result -= number;
        }
        System.out.println(result);
    }
}
