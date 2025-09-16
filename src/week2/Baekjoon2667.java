package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 2-2 (연결 요소의 개수)
public class Baekjoon2667 {
    // 지도 크기, 지도 변수
    static int size;
    static int[][] map;
    // 해당 단지 방문 여부를 확인
    static boolean[][] visited;
    // 각 단지 count 변수, 총 단지수 result 변수
    static List<Integer> total = new ArrayList<>();
    static int count;
    /**
     * 상하좌우 확인 데이터
     * x = 0, y = 1 인경우 우측 확인, x = 1, y = 0 인 경우 아래 확인
      */
    static int[] checkX = {0, 0, 1, -1};
    static int[] checkY = {1, -1, 0, 0};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());
        map = new int[size][size];
        visited = new boolean[size][size];
        count = 0;

        // 지도 생성
        for (int i = 0; i < size; i++) {
            String str = br.readLine();
            for (int j = 0; j < size; j++) {
                // char을 int로 변환시 아스키 코드값이 저장되기때문에 0의 아스키코드 값 빼줌
                map[i][j] = str.charAt(j) - 48;
            }
        }
        
        // 지도 내 모든 집 존재여부 확인
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    dfs(i, j);
//                    bfs(i, j);
                    total.add(count);
                    count = 0;
                }
            }
        }

        // 단지내 집의 수 정렬
        Collections.sort(total);

        StringBuilder sb = new StringBuilder();
        sb.append(total.size() + "\n");

        for (int num : total) {
            sb.append(num + "\n");
        }

        System.out.println(sb);

        br.close();
    }

    // dfs 를 이용해 구현
    static void dfs(int x, int y){
        visited[x][y] = true;
        count++;

        // 상하좌우 총 4번 확인
        for (int i = 0; i < 4; i++){
            int nx = x + checkX[i];
            int ny = y + checkY[i];
            
            // 상하좌우가 벽인 상황 예외처리
            if (nx < size && nx >= 0 && ny < size && ny >= 0){
                if (map[nx][ny] == 1 && !visited[nx][ny]){
                    dfs(nx, ny);
                }
            }
        }
    }

    // bfs 이용해 구현
    static void bfs(int x, int y){
        visited[x][y] = true;
        count++;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while(!queue.isEmpty()){
            int[] poll = queue.poll();
            for (int i = 0; i < 4; i++){
                int nx = poll[0] + checkX[i];
                int ny = poll[1] + checkY[i];

                if (nx < size && nx >= 0 && ny < size && ny >= 0){
                    if (map[nx][ny] == 1 && !visited[nx][ny]){
                        queue.add(new int[]{nx, ny});
                        visited[nx][ny] = true;
                        count++;
                    }
                }
            }
        }
    }
}
