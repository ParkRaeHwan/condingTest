package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon1759 {

    static int L, C;
    static String arr[], result[];
    static String[] vowels = {"a", "i", "e", "o", "u"};
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        arr = new String[C];
        result = new String[L];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < C; i++) {
            arr[i] = st.nextToken();
        }

        Arrays.sort(arr);

        dfs(0, 0, 0);
        System.out.println(sb);

        br.close();
    }

    static void dfs(int vowel, int depth, int index) {
        // 선택한 문자의 수가 L 이되는 경우 결과 출력
        if (depth == L) {
            if (vowel >= 1 && L - vowel >= 2) {
                for (String s : result) {
                    sb.append(s);
                }
                sb.append("\n");
            }
            return;
        }

        // 더 이상 선택할 문자 없는경우 종료
        if (index == C) {
            return;
        }

        // 모음인 경우
        if (Arrays.asList(vowels).contains(arr[index])) {
            result[depth] = arr[index];
            dfs(vowel + 1, depth + 1, index + 1);
        }
        // 자음인 경우
        else {
            result[depth] = arr[index];
            dfs(vowel, depth + 1, index + 1);
        }

        // 해당 문자 선택 X
        dfs(vowel, depth, index + 1);


    }
}
