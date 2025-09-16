package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 2-3
public class Baekjoon11724 {

    static int numNode;
    static int numEdge;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean visited[];
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        numNode = Integer.parseInt(st.nextToken());
        numEdge = Integer.parseInt(st.nextToken());
        visited = new boolean[numNode + 1];

        // 초기화 해줘야함
        for (int i = 0; i <= numNode; i++){
            graph.add(new ArrayList<>());
        }

        // 그래프 생성
        for (int i = 0; i < numEdge; i++){
            st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());
            graph.get(node1).add(node2);
            graph.get(node2).add(node1);
        }

        // bfs 탐색시마다 연결요소 값 증가
        for (int i = 1; i <= numNode; i++){
            if (!visited[i]){
//                bfs(i);
                dfs(i);
                result++;
            }
        }

        System.out.println(result);

        br.close();
    }

    // bfs 구현
    static void bfs(int startNode){
        visited[startNode] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startNode);

        while (!queue.isEmpty()){
            int node = queue.poll();
            for (int link : graph.get(node)) {
                if (!visited[link]){
                    visited[link] = true;
                    queue.add(link);
                }
            }
        }
    }

    // dfs 구현
    static void dfs(int node){
        visited[node] = true;
        for (int n : graph.get(node)) {
            if (!visited[n]){
                dfs(n);
            }
        }
    }
}
