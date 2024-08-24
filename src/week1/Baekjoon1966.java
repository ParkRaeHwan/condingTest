package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 1-5 문제(프린터 큐)
public class Baekjoon1966 {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());

        for (int i = 0; i < repeat; i++) {
            // 문서 수, 특정 문서 위치, 프린트수 초기화
            StringTokenizer st = new StringTokenizer(br.readLine());
            int fileCount = Integer.parseInt(st.nextToken());
            int fileIndex = Integer.parseInt(st.nextToken());
            int printCount = 0;

            st = new StringTokenizer(br.readLine());
            // queue 안 데이터를 배열(초기 문서 위치, 중요도 입력)로 입력받음
            Queue<int []> queue = new LinkedList<>();
            for (int j = 0; j < fileCount; j++){
                queue.add(new int[] {j, Integer.parseInt(st.nextToken())});
            }

            // 특정 위치의 문서가 출력될때까지 실행
            while(!queue.isEmpty()) {
                // 가장 앞의 문서확인
                int[] front = queue.poll();
                boolean check = true;

                // 중요도 확인
                for (int[] file : queue) {
                    // 중요도 낮은 경우
                    if (front[1] < file[1]){
                        queue.offer(front);
                        check = false;
                        break;
                    }
                }
                // 맨앞 문서의 중요도가 가장 높은경우
                if (check == true) {
                    printCount++;
                    // 특정 위치의 문서 출력시 반복문 종료
                    if (front[0] == fileIndex){
                        sb.append(printCount + "\n");
                        break;
                    }
                }
            }
        }
        System.out.print(sb);

        br.close();
    }
}
