package sparta.level2;

import java.util.Arrays;
import java.util.Scanner;

// Programmers 3진법 뒤집기
/*
    문제 : 입력받은 자연수 n 을 3진법 상에서 앞뒤로 뒤집은 후, 다시 10진법으로 표현한 수를 반환하는 로직 작성
          (1 <= n <= 100000000)
    풀이 : 자연수를 3 으로 나눠 나머지를 통해 3진수로 변환한뒤 해당 값을 통해 10진수로 변환
 */
public class No40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {};
        int index = 0;

        while (n > 0) {
            arr = Arrays.copyOf(arr, arr.length + 1);
            arr[index] = n % 3;
            n /= 3;
            index++;
        }

        int result = 0;
        index = arr.length - 1;
        for (int i : arr) {
            result += i * Math.pow(3, index);
            index--;
        }

        System.out.println(result);
        sc.close();
    }
}
