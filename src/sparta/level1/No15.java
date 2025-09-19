package sparta.level1;

import java.util.Scanner;

// Programmers 나머지가 1이 되는 수 찾기
/*
    문제 : 자연수 n 을 x 로 나눈 나머지가 1이 되도록 하는 가장 작은 x 를 반환하는 로직작성
    풀이 : 자연수 n 을 1부터 나눴을때 나머지가 1이 되는 경우 해당 값을 저장후 break 문을 걸어 반복문 종료해 값 출력 
 */
public class No15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                result = i;
                break;
            }
        }

        System.out.println(result);
        sc.close();
    }
}
