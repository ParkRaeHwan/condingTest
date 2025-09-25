package sparta.level1;

import java.util.Scanner;

// Programmers 콜라츠 추측
/*
    문제 : 콜라츠 추측은 모든수를 1로 만들 수 있다는 추측으로 1을 만들기 까지 총 몇번의 작업이 반복되는지를 구하는 로직 작성
          주어진 수가 1인경우 = 0, 500번 반복시까지 1이 되지 않는다면 -1을 반환
           1-1. 입력된 수가 짝수라면 2로 나눕니다.
           1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
           2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
    풀이 : while 문을 통해 위의 나온 작업을 순서대로 진행하며 1이 나오거나 반복이 500이 되는경우 종료하고 값을 반환

 */
public class No23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        int result = 0;

        while(!(n == 1)) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = (n * 3) + 1;
            }
            result++;

            if (result == 500) {
                result = -1;
                break;
            }
        }

        System.out.println(result);
        sc.close();
    }
}
