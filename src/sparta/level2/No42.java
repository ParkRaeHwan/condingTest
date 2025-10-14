package sparta.level2;

// Programmers 삼총사
/*
    문제 : 주어진 정수 배열에서 3개의 요소를 더했을때 값이 0 이 나오는 경우를 삼총사로 칭하며,
          해당 정수 배열에서 삼총사를 만들 수 있는 횟수를 반환하는 로직 작성
    풀이 : 배열을 3중 반복문을 돌려 각 요소들의 합을 더한뒤 해당 값이 0 이 나오는 경우를 카운트해 결과 반환
 */
public class No42 {
    public static void main(String[] args) {
        int[] number = {-3, -2, -1, 0, 1, 2, 3};
        int result = 0;

        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        result++;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
