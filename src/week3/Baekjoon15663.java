package week3;

import java.util.Arrays;
import java.util.Scanner;

// 3-2
public class Baekjoon15663 {

    // 결과 배열, 입력받을 숫자 배열, 방문 확인 배열 생성
    static int arr[], nums[];
    static boolean visited[];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        arr = new int[m];
        nums = new int[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);

        dfs(n, m, 0);
        System.out.println(sb);

    }

    static void dfs(int n, int m, int depth){
        if (depth == m){
            for (int num : arr) {
                sb.append(num + " ");
            }
            sb.append("\n");
            return;
        }
        // 재귀 상태 값(마지막으로 입력된 값) 저장할 변수 선언
        int num = 0;

        for (int i = 0; i < n; i++){
            // 현재 재귀의 상태 값과 다음 수열의 값이 동일한 경우 실행 X
            if (!visited[i] && num != nums[i]){
                visited[i] = true;
                arr[depth] = nums[i];
                // 현재 재귀 상태의 값을 저장
                num = nums[i];
                dfs(n, m, depth + 1);
                visited[i] = false;
            }
        }
    }
}
