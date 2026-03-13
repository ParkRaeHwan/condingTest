package sparta.level2;

// Programmers 푸드 파이트 대회
/*
    문제 : 칼리로가 적은 순서대로 담긴 정수 배열을 통해 대회를 위한 음식 배치를 나타내는 문자열 반환
          (동일한 음식 양, 순서를 지켜야하며, 각각 왼쪽, 오른쪽에서 시작한다 가정하며 가운데에는 물(0) 배치)
    풀이 : 왼쪽에 배치할 음식 양, 순서를 구한뒤 "0" + 문자열.reverse() 통해 결과 반환
*/
public class No51 {
    public static void main(String[] args) {
        int[] food = {1, 3, 4, 6};
        String answer = "";

        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer += i;
            }
        }

        answer = answer + "0" + new StringBuilder(answer).reverse();
        System.out.println(answer);

//        안쪽에서부터 값을 채워서 결과 반환 하는 방식
//        for (int i = food.length - 1; i > 0; i--) {
//            for (int j = 0; j < food[i] / 2; j++) {
//                answer = i + answer + i;
//            }
//        }
    }
}
