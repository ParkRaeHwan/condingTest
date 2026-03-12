package sparta.level2;

// Programmers 가장 가까운 같은 글자
/*
    문제 : 주어진 문자열의 각 글자별로 자신 보다 앞에 나왔으며 자신과 가장 가까운 글자의 위치를 반환 (없는 경우 -1 반환)
        ex) banana = [-1 ,-1, -1 , 2, 2, 2]
    풀이 : 현재 위치를 기준으로 이전 글자와 동일한 글자가 존재하는 경우 인덱스값을 통해 거리값을 계산후 결과 반환
*/
public class No50 {
    public static void main(String[] args) {
        String s = "banana";
        int[] result = new int[s.length()];
        int temp;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            temp = -1;
            for (int j = 0; j < i; j++) {
                if (c == s.charAt(j)) {
                    temp = i - j;
                }
            }
            result[i] = temp;
        }

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
