package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 1-6 문제(단어 뒤집기)
public class Baekjoon9093 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        int repeat = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repeat; i++){
            // 입력받은 문자열 char 배열로 변환
            char[] spells = br.readLine().toCharArray();

            // 글자 수 만큼 실행
            for (int j = 0; j < spells.length; j++){
                // 공백이거나 끝인경우 실행
                if (spells[j] == ' ' || j == spells.length - 1){
                    // 끝인경우 stack에 push
                    if (j == spells.length -1){
                        stack.push(spells[j]);
                    }
                    // stack안 모든 글자 pop
                    while (!stack.isEmpty()){
                        sb.append(stack.pop());
                    }
                    // 공백인경우 결과에 공백 추가
                    if (spells[j] == ' '){
                        sb.append(" ");
                    }
                }
                // 글자인경우 stack에 push
                else {
                    stack.push(spells[j]);
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
