package sparta.level1;

import java.util.Scanner;

// Programmers 하샤드 수
/*
    문제 : 자연수 x 가 하샤드 수인지 검사하는 로직 작성 (하샤드 수 인경우 = true, 아닌경우 = false 반환)
    (하샤드 수 : x 의 자릿수의 합으로 x 가 나누어 떨어지는 경우 x 는 하샤드 수이다.)
    풀이 : 각 자릿수의 합을 계산한뒤 입력받은 x 값과 나눠 몫이 0 인경우 true, 아닌경우 false 반환
 */
public class No21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        // 자릿수의 합, x 값 복사본 생성
        int div = 0;
        int temp = x;
        while (!(x == 0)){
            div += x % 10;
            x = x / 10;
        }

        if (temp % div == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        sc.close();
    }
}
