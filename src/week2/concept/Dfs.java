package week2.concept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Dfs {

    // 인접 행렬을 통해 그래프 표현
    static int[][] edge = {{0, 1, 1, 0, 0, 0, 0},
            {1, 0, 0, 1, 1, 0, 0},
            {1, 0, 0, 0, 0, 1, 1},
            {0, 1, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0}};
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        DFS(1, 7); // 1 0 2 5 6 3 4 순서로 방문
        System.out.println(sb);
    }

    // 시작 노드, 노드 수를 입력받음
    public static void DFS(int startNode, int numNodes) {
        // 정점 방문 여부를 모두 false 로 초기화
        boolean[] visited = new boolean[numNodes];
        // 재귀 함수 호출
        recursiveDfs(startNode, visited, numNodes);
    }

    public static void recursiveDfs(int node, boolean[] visited, int numNodes){
        visited[node] = true;
        sb.append(node + " ");
        for (int i = 0; i < numNodes; i++){
            /**
             * 인접한 정점간 간선이있고, 해당 정점 방문 안했을경우
             * -> 해당 정점 기준으로 DFS 실행
              */
            if (edge[node][i] == 1 && !visited[i]){
                recursiveDfs(i, visited, numNodes);
            }
        }
    }

}
