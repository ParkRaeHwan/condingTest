package sparta.level2;


import java.util.Scanner;

// Programmers 약수의 개수와 덧셈
/*
    문제 : 두 정수 left, right 까지 모든 수중 약수의 개수가 짝수인 수는 더하고, 홀수인 수는 뺀수를 반환하는 로직 작성
    풀이 : 이중 for 문을 이용해 바깥 for 문은 입력받은 left ~ right 까지 반복을 걸고
          안쪽 for 문은 1 ~ left 까지의 반복을 걸어 입력받은 값의 약수를 구하는데 사용한다
          안쪽 for 문에서 해당 수가 약수인 경우 check 에 값을 +1 하며 1 ~ left 까지 반복이 종료되면 다음 수에 대해 위 과정을 동일하게 반복한다
 */
public class No33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        int result = 0;
        int check = 0;

        // left ~ right 반복
        for (int i = left; i <= right; i++) {
            check = 0;
            // 약수 계산 목적 1 ~ left 반복
            for (int j = 1; j <= i; j ++){;
                if (i % j == 0) {
                    check += 1;
                }
            }
            if (check % 2 == 0) {
                result += i;
            } else {
                result -= i;
            }
        }

        System.out.println(result);

        sc.close();
    }
}
