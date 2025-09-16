package sparta.level2;

import java.util.Scanner;

// Programmers 수박수박수박수?
/*
    문제 : 길이가 n이고, "수박수박수..." 같은 패턴을 반환하는 로직 작성
    풀이 : 입력받은 n 번의 횟수만큼 반복문을 진행하며
          n 의 값이 짝수인 경우 '수' 홀수인경우 '박' 을 문자열로 추가해 반환
 */
public class No31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        System.out.println(solution(i));
        sc.close();
    }

    public static String solution(int n) {
        String answer = "";
        String[] data = {"수", "박"};

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                answer = answer + data[0];
            } else {
                answer = answer + data[1];
            }
        }
        return answer;
    }
}
