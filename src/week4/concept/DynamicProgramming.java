package week4.concept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 피보나치 수열 사용
public class DynamicProgramming {
    // 결과값을 보관할 배열
    static int[] bottomDownArray;
    static int[] topUpArray;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 피보나치 수열 크기
        int n = Integer.parseInt(br.readLine());
        bottomDownArray = new int[n + 1];
        topUpArray = new int[n + 1];

        // Tabluation 방식 (반복문 사용)
        System.out.println(bottomDown(n));
        // Memoization 방식 (재귀 호출)
        System.out.println(topUp(n));

        br.close();
    }

    // Tabluation 방식 (반복문 사용)
    static int bottomDown(int n){
        // 기저 상태 값 초기화
        bottomDownArray[0] = 0;
        bottomDownArray[1] = 1;

        // 아래 -> 위 방향으로 문제 해결
        for (int i = 2; i <= n; i++){
            bottomDownArray[i] = bottomDownArray[i - 1] + bottomDownArray[i - 2];
        }
        return bottomDownArray[n];
    }

    // Memoization 방식 (재귀 호출)
    static int topUp(int n){
        // 기저 상태 도달 시, 0, 1로 초기화
        if (n < 2){
            return topUpArray[n] = n;
        }

        // 메모된 값이 있는경우 반환
        if (topUpArray[n] > 0){
            return topUpArray[n];
        }

        // 위 -> 아래 방향으로 문제 해결
        topUpArray[n] = topUp(n - 1) + topUp(n - 2);

        return topUpArray[n];
    }
}
