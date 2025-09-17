package sparta.level1;

import java.util.Scanner;

// Programmers 각도기
/*
    문제 : 각에서 0 ~ 90 = 예각(1), 90 = 직각(2), 90 ~ 180 = 둔각(3), 180 = 평각(4) 로 분류
        각의 값이 주어질때 해당 각에 맞는 값을 반환하는 로직 작성
    풀이 : 다양한 방식으로 시도해보기위해 90을 나눈값을 통해 각을 구분
 */
public class No8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle = sc.nextInt();
        if (!(angle % 90 == 0)) {
            if ((float) angle / 3 <= 30) {
                System.out.println(1);
            } else {
                System.out.println(3);
            }
        } else {
            if (angle / 90 == 1) {
                System.out.println(2);
            } else {
                System.out.println(4);
            }
        }
        sc.close();
    }
}
