package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon6987 {
    // 해당 결과의 승, 무, 패 기록을 저장할 배열, 결과 판별 변수 생성
    static int win[], draw[], lose[];
    static boolean result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        win = new int[6];
        draw = new int[6];
        lose = new int[6];

        for (int i = 0; i < 4; i++){
            int total = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 6; j++){
                win[j] = Integer.parseInt(st.nextToken());
                draw[j] = Integer.parseInt(st.nextToken());
                lose[j] = Integer.parseInt(st.nextToken());
                total += win[j] + draw[j] + lose[j];
            }
            result = false;
            // 모든 경기를 수행했을시에만 수행
            if (total == 30) {
                dfs(0, 0, 1);
            }
            if (result){
                sb.append(1 + " ");
            }else{
                sb.append(0 + " ");
            }
        }
        System.out.println(sb);
        br.close();
    }

    static void dfs(int team, int round, int enemy){
        // 재귀 구조에서 참인경우 빠르게 종료되도록 백트래킹
        if (result){
            return;
        }
        // 해당 값이 0 보다 작은경우는 해당 결과가 잘못된 결과이므로 백트래킹
        if (win[team] < 0 || draw[team] < 0 || lose[team] < 0
                || win[team + enemy - 1] < 0 || draw[team + enemy - 1] < 0 || lose[team + enemy - 1] < 0 ){
            return;
        }
        
        // 해당 결과 존재하므로 백트래킹
        if (round == 15){
            result = true;
            return;
        }

        // 라운드별 기준이 되는 팀 변경
        if (round == 5){
            team++;
            enemy = 1;
        } else if (round == 9) {
            team++;
            enemy = 1;
        } else if (round == 12) {
            team++;
            enemy = 1;
        } else if (round == 14) {
            team++;
            enemy = 1;
        }


        // 1번경우 : team 승, enemy 패
        win[team]--; lose[team + enemy]--;
        // 다음 팀과 대결
        dfs(team, round + 1, enemy + 1);
        // 1번경우 X 인경우 초기화
        win[team]++; lose[team + enemy]++;

        // 2번경우 : team 패, enemy 승
        lose[team]--; win[team + enemy]--;
        dfs(team, round + 1, enemy + 1);
        lose[team]++; win[team + enemy]++;

        // 3번경우 : 무승부
        draw[team]--; draw[team + enemy]--;
        dfs(team, round + 1, enemy + 1);
        draw[team]++; draw[team + enemy]++;
    }
}
