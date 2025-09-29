package sparta.level1;

// Programmers 음 양 더하기
/*
    문제 : 정수들의 절대값 배열(absolutes)과 정수들의 부호를 담은 불리언 타입 배열(signs)이 주어졌을때 실제 정수들의 합을 반환하는 로직작성
          (1 <= absolutes 요소 <= 1000, sign.length == absolutes.length, true = +, false = -)
    풀이 : 각 요소 들의 부호를 비교해 true 인경우 더하며 false 인경우 값을 차감
 */
public class No26 {
    public static void main(String[] args) {
        int[] absolutes = {4,7,12};
        boolean[] signs = {true, false, true};
        int result = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                result += absolutes[i];
            } else {
                result -= absolutes[i];
            }
        }

        System.out.println(result);
    }
}
