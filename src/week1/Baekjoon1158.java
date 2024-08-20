package week1;

import java.util.LinkedList;
import java.util.Scanner;

public class Baekjoon1158 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // LinkedList 자료구조를 이용해 queue 구현
        LinkedList queue = new LinkedList();
        // 결과 출력을 위한 StringBuilder 생성
        StringBuilder result = new StringBuilder();

        // 입력 처리 (N -> size, K -> delete)
        int size = sc.nextInt();
        int delete = sc.nextInt();

        // 데이터 입력
        for (int i = 1; i <= size; i++){
            queue.add(i);
        }

        result.append("<");
        while (queue.size() != 1){
            for (int i = 0; i < delete - 1; i++){
                /**
                 * LinkedList의 offer메서드를 이용해 K 순서가 아닌경우
                 * 맨앞의 데이터를 뒤에 다시 삽입 (Queue 구조 사용)
                 */
                queue.offer(queue.poll());
            }
            result.append(queue.poll() + ", ");
        }
        result.append(queue.poll() + ">");

        System.out.println(result);

        sc.close();
    }

}
