package week2.concept;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {

    // 인접 행렬을 통해 그래프 표현
    static int[][] edge = {{0, 1, 1, 0, 0, 0, 0},
            {1, 0, 0, 1, 1, 0, 0},
            {1, 0, 0, 0, 0, 1, 1},
            {0, 1, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0}};

    public static void main(String[] args) {
        BFS(0, 7); // 0 1 2 3 4 5 6 순서로 방문
        BFS(2, 7); // 2 0 5 6 1 3 4 순서로 방문
    }
    
    // 시작 노드, 노드 수를 입력받음
    public static void BFS(int startNode, int numNodes) {
        // 정점 방문 여부를 모두 false 로 초기화
        boolean[] visited = new boolean[numNodes];
        // queue 를 사용해 구현
        Queue<Integer> queue = new LinkedList<>();

        // 시작 노드 초깃값 설정, queue 삽입
        visited[startNode] = true;
        queue.add(startNode);
        StringBuilder sb = new StringBuilder();

        while(!queue.isEmpty()){
            int node = queue.poll();
            sb.append(node + " ");

            // 시작 루트의 인접한 정점부터 탐색시작
            for (int i = 0; i < numNodes; i++){
                /**
                 * 인접한 정점간 간선이있고, 해당 정점 방문 안했을경우
                 * -> 인접 정점을 queue 삽입 + 방문 표시
                 */
                //
                if (edge[node][i] == 1 && !visited[i]){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
        System.out.println(sb);
    }

}
