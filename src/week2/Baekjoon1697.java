package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 2-5 (숨바꼭질)
public class Baekjoon1697 {

    static int n, k;
    static int map[] = new int[100001]; // 각 위치별 도착시 걸리는 시간
    static boolean visited[] = new boolean[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        System.out.println(bfs(n));
        br.close();
    }

    static int bfs(int start) {
        visited[start] = true;
        map[start] = 0; // 시작 위치 0초로 초기화
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();

            // k 위치 도착시 해당 k 위치까지 걸리는 시간 반환
            if (node == k){
                return map[node];
            }

            // 이동 가능한 경우 3가지
            int check[] = {node - 1, node + 1, node * 2};
            for (int index : check) {
                // 해당 이동 위치가 범위내인지 + 방문여부 확인
                if (index >= 0 && index <= 100000 && !visited[index]) {
                    queue.add(index);
                    visited[index] = true;
                    // 해당 위치까지 걸리는 시간을 이전 위치 도달 시간 + 1초로 갱신
                    map[index] = map[node] + 1;
                }
            }

        }

        // 아무 값이나 리턴 (목적지 반드시 도착하기 때문)
        return -1;
    }

}
