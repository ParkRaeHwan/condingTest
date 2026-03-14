package sparta.level2;

// Programmers 콜라 문제
/*
    문제 : 마트에 빈병 a개를 주었을때 b개의 콜라를 주는 경우, n 개의 빈병을 주었을때 받을수있는 콜라의 개수 반환
    풀이 : 현재 보유중인 빈병의 개수(n)를 a 만큼 교환이 불가능할때까지 반복문을 통해 계산하며 과정에서 발생되는 값 계산
          (수학적 관점 풀이 +)
*/
public class No52 {
    public static void main(String[] args) {
        int a = 3, b = 1, n = 20;
        System.out.println(solution(a, b, n));
    }

    static public int solution(int a, int b, int n) {
        int empty = n;
        int answer = 0;

        while((empty / a) > 0) {
            answer += (b * (empty / a));
            empty = (b * (empty / a)) + (empty % a);
        }

        // 수학적 관점 풀이
        // (반드시 남는 빈병의 수, 실제 교환시 차감되는 병의 수, 교환시 얻는 콜라수 를 통해 O(1) 시간 복잡도 만에 계산 가능)
        // n - b / (a - b) * b

        return answer;
    }
}
