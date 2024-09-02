package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 3-1
public class Baekjoon15651 {

    static int arr[];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 초기화
        arr = new int[m];

        dfs(n, m, 0);
        System.out.println(sb);

        br.close();
    }

    static void dfs(int n, int m, int depth){
        if (depth == m){
            for (int num : arr) {
                sb.append(num + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= n; i++){
            arr[depth] = i;
            dfs(n, m, depth + 1);
        }
    }
}
