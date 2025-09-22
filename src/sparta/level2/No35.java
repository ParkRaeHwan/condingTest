package sparta.level2;

import java.util.Scanner;

// Programmers 부족한 금액 계산하기
/*
    문제 : 놀이 기구 이용시 자신이 가진 금엑에서 부족한 금액을 계산하는 로직 작성
          놀이기구의 이용 가격은 price 이고 N 번째 이용시마다 기존 이용료의 N 배를 받아 총 놀이기구를 count 번 이용했을때
          자신이 가지고있는 금액에서 얼마가 모자란지를 계산하는 로직
          (1 ≤ price ≤ 2,500,  1 ≤ money ≤ 1,000,000,000, 1 ≤ count ≤ 2,500)

    풀이 : count 만큼 반복해 총 놀이기구 이용시 필요한 총 금액을 구한뒤,
          해당 금액이 보유한 금액보다 적을때 0, 많을때 필요한 총 금액 - 소지 금액을 통해 계산
          count, price 값이 2500 인경우 int 자료형에 모든 금액이 계산되지 않으므로 long 타입을 캐스팅해 계산
 */
public class No35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int money = sc.nextInt();
        int count = sc.nextInt();

        // int 크기 고려해 long 으로 캐스팅해 계산
        long result = 0;

        for (int i = 1; i <= count; i++) {
            result += (long) price * i;
        }

        System.out.println(result > money? result - money : 0);

        sc.close();
    }
}
