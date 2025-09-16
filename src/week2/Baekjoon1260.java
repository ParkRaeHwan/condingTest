package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 2-1 (DFS와 BFS, 80338210 추가 참고, 인접 리스트 사용한 방식)
public class Baekjoon1260 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numNode = Integer.parseInt(st.nextToken());
        int numEdge = Integer.parseInt(st.nextToken());
        int startNode = Integer.parseInt(st.nextToken());

        // 인접 행렬 방식 이용
        // + 1 한 이유 = 편하기 코드 작성을 위함
        int[][] nodes = new int[numNode + 1][numNode + 1];

        // 그래프 초기화
        for (int i = 0; i < numEdge; i++){
            st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());
            nodes[node1][node2] = 1;
            nodes[node2][node1] = 1;
        }

        StringBuilder sb = new StringBuilder();
        // DFS 구현
        boolean[] visited = new boolean[numNode + 1];
        recursiveDfs(startNode, visited, nodes, numNode, sb);
        System.out.println(sb);

        sb = new StringBuilder();
        // BFS 구현
        Queue<Integer> queue = new LinkedList<>();
        visited = new boolean[numNode + 1];
        visited[startNode] = true;
        queue.add(startNode);

        while (!queue.isEmpty()){
            int node = queue.poll();
            sb.append(node + " ");

            // 작은 번호의 정점부터 확인
            for (int i = 1; i < numNode + 1; i++){
                // 간선 존재 + 방문 X 한 경우
                if (nodes[node][i] == 1 && !visited[i]){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
        System.out.println(sb);

        br.close();
    }

    public static void recursiveDfs(int node, boolean visited[], int[][] nodes, int numNode, StringBuilder sb){
        visited[node] = true;
        sb.append(node + " ");
        for (int i = 1; i < numNode + 1; i++){
            // 간선 존재 + 방문 X 한 경우
            if (nodes[node][i] == 1 && !visited[i]){
                // 재귀 호출
                recursiveDfs(i, visited, nodes, numNode, sb);
            }
        }

    }
}
