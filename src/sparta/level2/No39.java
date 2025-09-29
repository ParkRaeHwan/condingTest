package sparta.level2;


import java.util.Scanner;

// Programmers 최대공약수와 최소공배수
/*
    문제 : 입력받은 두수의 최대 공약수, 최소공배수를 반환하는 로직 작성
          (1 <= n, m <= 1000000)
    풀이 : 입력받은 두수중 더 작은 수를 통해 최대 공약수를 구하며
          최소 공배수는 두수 의 곱을 최대 공약수로 나눈 값으로 계산
 */
public class No39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] result = new int[2];

        for (int i = Math.min(n, m); i > 0; i--) {
            if (n % i == 0 && m % i == 0) {
                result[0] = i;
                // 최소 공배수 = (두 수의 곱) / 최대 공약수
                result[1] = (n * m) / result[0];
                break;
            }
        }

        System.out.println(result[0] + " " + result[1]);
        sc.close();
    }
}
