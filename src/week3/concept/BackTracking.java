package week3.concept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackTracking {

    // 중복 숫자 확인, 탐색 순열 배열 생성
    static boolean visit[];
    static int arr[];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        visit = new boolean[n];
        arr = new int[m];
        dfs(n, m, 0);

        br.close();
    }

    // depth는 깊이를 나타내는 변수로, 현재 재귀 숫자를 카운트
    static void dfs(int n, int m, int depth){
        // 재귀 값이 m 과 같은경우 배열안 요소 출력
        if (depth == m){
            for (int num : arr) {
                System.out.print(num +" ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++){
            // 해당 노드 방문하지 않는경우 (조건 만족, 유망성 O)
            if (!visit[i]){
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(n, m, depth + 1);
                
                // 자식 노드 방문후 돌아오면 현재 노드를 방문하지 않은상태로 변경 (백트래킹)
                visit[i] = false;
            }
        }
        return;
    }
}
