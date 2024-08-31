package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 2-6
public class Baekjoon2178 {

    static int map[][];
    // 이동가능한 칸별 이동시 지나야하는 칸수 저장 배열
    static int check[][];
    static int row, col;
    static boolean visited[][];
    static int checkX[] = {0, 0, 1, -1};
    static int checkY[] = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());
        map = new int[row][col];
        check = new int[row][col];
        visited = new boolean[row][col];

        // map 생성
        for (int i = 0; i < row; i++){
            String str = br.readLine();
            for (int j = 0; j < col; j++){
                map[i][j] = str.charAt(j) - 48;
            }
        }

        System.out.println(bfs(0, 0));
        br.close();
    }

    // bfs 사용
    static int bfs(int x, int y){
        visited[x][y] = true;
        check[x][y] = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y});
        
        while(!queue.isEmpty()){
            int node[] = queue.poll();
                
            // 해당 위치 도착시 해당 위치까지 이동시 필요한 칸수 반환
            if (node[0] == row - 1 && node[1] == col - 1){
                return check[node[0]][node[1]];
            }

            // 상하좌우 확인
            for (int i = 0; i < 4; i++){
                int nx = node[0] + checkX[i];
                int ny = node[1] + checkY[i];

                // 이동범위 내 + 방문 여부 + 1 인지 확인
                if (nx >= 0 && nx < row && ny >= 0 && ny < col){
                    if (map[nx][ny] == 1 && !visited[nx][ny]){
                        queue.add(new int[] {nx, ny});
                        visited[nx][ny] = true;
                        // 현재 칸수까지 이동거리 = 이전 칸수 이동거리 + 1
                        check[nx][ny] = check[node[0]][node[1]] + 1;
                    }
                }
            }
        }
        return -1;
    }
}
