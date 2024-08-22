package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 1-4 문제
public class Baekjoon9012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> stack = new Stack<>();
        int repeat = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repeat; i++){
            // 스택 초기화
            stack.clear();
            String VPS = "YES";
            String input = br.readLine();
            // 입력받은 문자열 괄호 하나씩 분리
            String[] split = input.split("");
            for (String word : split) {
                // 여는 괄호인 경우 push
                if (word.equals("(")){
                    stack.push("(");
                }
                else {
                    // 닫는 괄호이면서 stack안에 쌍을 이루는 여는 괄호 없는경우
                    if (stack.isEmpty()){
                        stack.push(")");
                        break;
                    }
                    // stack안 여는 괄호 있는경우
                    stack.pop();
                }
            }

            // stack 이 비었으면 YES, 안비었으면 NO
            if (!stack.isEmpty()){
                VPS = "NO";
            }
            sb.append(VPS + "\n");
        }

        System.out.println(sb);
        br.close();
    }
}
