package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1182 {

    static int n, s, result = 0;
    static int arr[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0);
        // 모든 수열의 원소가 없는경우(= 공집합) sum의 기본값으로 0을 넘겨줬으므로 - 1 해줌
        if (s == 0){
            result--;
        }
        System.out.println(result);

        br.close();
    }

    static void dfs(int depth, int sum) {
        // 수열내 모든 원소의 여부 확인 완료시 결과 확인
        if (depth == n){
            if (sum == s){
                result++;
            }
            return;
        }
        // 다음 원소가 있는경우
        dfs(depth + 1, sum + arr[depth]);
        // 다음 원소가 없는경우
        dfs(depth + 1, sum);

    }
}
