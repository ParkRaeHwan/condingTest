package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 2-4 (유기농 배추)
public class Baekjoon1012 {

    static int result, row, col;
    static boolean visited[][];
    // 상하좌우 확인 인덱스
    static int checkX[] = {0, 0, 1, -1};
    static int checkY[] = {1, -1,  0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repeat; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 가로, 세로, 배추수
            col = Integer.parseInt(st.nextToken());
            row = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            // 지도 초기화
            int map[][] = new int[row][col];
            for (int j = 0; j < num; j++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[y][x] = 1;
            }

            // 지렁이 수 카운트
            result = 0;
            visited = new boolean[row][col];
            for (int j = 0; j < row; j++){
                for (int k = 0; k < col; k++){
                    if (!visited[j][k] && map[j][k] == 1){
//                        dfs(j, k, map);
                        bfs(j, k, map);
                        result++;
                    }
                }
            }
            sb.append(result + "\n");
        }

        System.out.println(sb);

        br.close();
    }

    // dfs 생성
    static void dfs(int x, int y, int[][] map){
        visited[x][y] = true;

        for(int i = 0; i < 4; i++){
            int nx = x + checkX[i];
            int ny = y + checkY[i];

            if (nx >= 0 && nx < row && ny >= 0 && ny < col){
                if (!visited[nx][ny] && map[nx][ny] == 1){
                    dfs(nx, ny, map);
                }
            }

        }
    }

    // bfs 생성
    static void bfs(int x, int y, int[][] map){
        visited[x][y] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y});

        while(!queue.isEmpty()){
            int[] index = queue.poll();

            for (int i = 0; i < 4; i++){
                int nx = index[0] + checkX[i];
                int ny = index[1] + checkY[i];

                if (nx >= 0 && nx < row && ny >= 0 && ny < col){
                    if (!visited[nx][ny] && map[nx][ny] == 1){
                        queue.add(new int[] {nx, ny});
                        visited[nx][ny] = true;
                    }
                }
            }
        }
    }
}
