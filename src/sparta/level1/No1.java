package sparta.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Programmers 두수의 차
/*
    문제 : 입력된 두수의 차를 구하는 로직 작성
 */
public class No1 {

    public static void main(String[] args) throws IOException {
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.print(Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken()));
    }
}
