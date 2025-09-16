package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2-6 (좋은 수열)
public class Baekjoon2661 {

    static int N;
    static boolean find = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        dfs(0, "");
        br.close();
    }

    static void dfs(int depth, String s) {
        if (find) {
            return;
        }

        if (depth == N) {
            // 수열이 완성되면 결과를 출력하고 종료
            System.out.println(s);
            find = true;
            return;
        }

        // 수열을 생성하면서 좋은수열인지 검사
        for (int i = 1; i < 4; i++) {
            if (check(s + i)) {
                dfs(depth + 1, s + i);
            }
        }
    }
    
    // 수열이 좋은 수열인지 검사
    static boolean check(String s) {
        // 시작 검사 지점
        int start = s.length() - 1;
        for (int i = 1; i <= s.length() / 2; i++){
            if (s.substring(start - i, s.length() - i).equals(s.substring(start, s.length()))){
                return false;
            }
            // 현재 수열 길이만큼 확인
            start -= 1;
        }
        return true;
    }
}
